package board.util;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUploadUtil {
	public Map<String, String> uploadFile(HttpServletRequest request) {
		Map<String, String> dataMap = new HashMap<String, String>();
		
		// file upload 요청이 있는지 확인
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);

		if(isMultipart) {
			// 전송된 파일을 디스크(서버)에 저장하기 위한 객체 생성
			DiskFileItemFactory factory = new DiskFileItemFactory();
			// upload handler 생성
			ServletFileUpload upload = new ServletFileUpload(factory);
			
			List<FileItem> fileItems = null;
			try {
				fileItems = upload.parseRequest(request);
			} catch (FileUploadException e1) {
				e1.printStackTrace();
			}
			String fieldName = null, fileName = null, value = null;
			
			Iterator<FileItem> iter = fileItems.iterator();
			
			while(iter.hasNext()) {
				FileItem item = iter.next();
				
				if(item.isFormField()) { // input type = file 아닌 것
					fieldName = item.getFieldName(); // key
					try {
						value = item.getString("utf-8"); // value
						dataMap.put(fieldName, value);
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}
				} else {
					fieldName = item.getFieldName(); // key
					fileName = item.getName(); // value
					
					// 저장
					if(!fileName.isEmpty()) {
						String path = "c:\\upload";
						
						// 동일한 파일명이 들어올 경우를 위해
						// 128bit 고유값 추출
						UUID uuid = UUID.randomUUID();
						
						// d:\\upload\\1.jpg
						File file = new File(path + "\\" + uuid.toString() + "_" + fileName);
						dataMap.put(fieldName, file.getName());
						try {
							item.write(file);
						} catch (Exception e) {
							e.printStackTrace();
						}
						
					}
				}
			}
		}
		return dataMap;
	}
}
	
