package com.cn.hnust.pojo;
/**
 * @项目名称：wifi故事机
 * @类名称：Result
 * @类描述： 返回值存储
 * @创建人： 余贞航
 * @创建时间： 2016-08-14
 * @修改人：
 * @修改时间： 
 * @修改备注： 
 * 
 * @version V1.0
 */
public class Result {
	private boolean success = true;     //成功状态(成功为true/失败为false)
	private String  message = "执行成功";  //提示信息
	private String  status = "0";       //状态码(0=执行成功/1=执行失败)
	
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
