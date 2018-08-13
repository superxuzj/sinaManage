package com.boliangshenghe.sina.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.boliangshenghe.sina.entity.Earthquake;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class JxlUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		JxlUtil.getUserList();
		
		// TODO Auto-generated method stub
		// 创建一个list 用来存储读取的内容
		List<String[]> list = new ArrayList<String[]>();
		List<Earthquake> userList = new ArrayList<Earthquake>();
		Workbook rwb = null;
		Cell cell = null;

		// 创建输入流
		InputStream stream;
		try {
			stream = new FileInputStream("d:\\earth.xls");
			// 获取Excel文件对象
			rwb = Workbook.getWorkbook(stream);

			// 获取文件的指定工作表 默认的第一个
			Sheet sheet = rwb.getSheet(0);

			// 行数(表头的目录不需要，从1开始)
			for (int i = 1; i < sheet.getRows(); i++) {
				// 创建一个数组 用来存储每一列的值
				String[] str = new String[sheet.getColumns()];
				// 列数
				for (int j = 0; j < sheet.getColumns(); j++) {
					// 获取第i行，第j列的值
					cell = sheet.getCell(j, i);
					str[j] = cell.getContents();
				}
				// 把刚获取的列存入list
				list.add(str);
			}
			System.out.println(list.size());
			List<Earthquake> earthList = new ArrayList<Earthquake>();
			for (int i = 0; i < list.size(); i++) {
				String[] str = (String[]) list.get(i);
				Earthquake earthquake = new Earthquake();
				 String timestr = "";
				for (int j = 0; j < str.length; j++) {
					 //System.out.println(str[j]);
					// User user
					String tempstr = str[j];
					//小数点 经纬度处理
					if(tempstr.length()==1 && j<5) {
						tempstr = "0"+tempstr;
					}else if(tempstr.indexOf(".")!=-1 && j==5) {//秒
						tempstr = tempstr.substring(0, 2);
						if(tempstr.indexOf(".")!=-1 || tempstr.length()==1) {
							tempstr ="0"+tempstr.substring(0, 1);
						}
					}else if(tempstr.indexOf(".")!=-1 && (j==6||j==7)) {//纬度 经度
						String latlo[] = tempstr.split("\\.");
						if(latlo[0].length()==2) {
							latlo[0] = "0"+latlo[0];
						}
						if(latlo[1].length()==2) {
							latlo[1] = latlo[1]+"0";
						}else if(latlo[1].length()==1) {
							latlo[1] = latlo[1]+"00";
						}
						tempstr = latlo[0]+"."+latlo[1];
					}else if(tempstr.indexOf(".")==-1 && (j==6||j==7)) {//纬度 经度
						if(tempstr.length()==1) {
							tempstr = "00"+tempstr;
						}else if(tempstr.length()==2) {
							tempstr = "0"+tempstr;
						}
						tempstr = tempstr+".000";
					}
					//给earthquake对象赋值
					if (j == 0  ) {
						timestr = timestr+tempstr+"-";
					} else if (j == 1) {
						timestr = timestr+tempstr+"-";
					} else if (j == 2) {
						timestr= timestr+tempstr+" ";
					} else if (j == 3 || j == 4) {
						timestr= timestr+tempstr+":";
					}else if (j == 5) {
						if(tempstr.length()==1 ) {
							tempstr = "0"+tempstr;
						}
						timestr= timestr+tempstr;
						earthquake.setEqtime(timestr);
						//System.out.println(timestr);
					}else if (j == 6) {
						earthquake.setLatitude(tempstr);//纬度
					}else if (j == 7) {
						earthquake.setLongitude(tempstr);
					}else if (j == 8) {
						earthquake.setDepth(tempstr);
					}else if (j == 9) {
						earthquake.setType (tempstr);
					}else if (j == 10) {
						earthquake.setMagnitude(tempstr);
					}else if (j == 11) {
						earthquake.setLocation(tempstr);
					}else if (j == 12) {
						earthquake.setRemark(tempstr);
					}
				}
				if(StringUtils.isNotBlank(earthquake.getEqtime())
						&&StringUtils.isNotBlank(earthquake.getLongitude()))
					earthList.add(earthquake);
			}
			
			System.out.println(earthList.size());
			for (Earthquake earthquake : earthList) {
				System.out.println(earthquake.getEqtime() + "a " + earthquake.getLatitude()
						+ "b " + earthquake.getLongitude()+"c ");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

	public static List<Earthquake> getEarthquakeList() {
//		JxlUtil.getUserList();
		
		// TODO Auto-generated method stub
		// 创建一个list 用来存储读取的内容
		List<String[]> list = new ArrayList<String[]>();
		Workbook rwb = null;
		Cell cell = null;
		// 创建输入流
		InputStream stream;
		List<Earthquake> earthList = new ArrayList<Earthquake>();
		try {
			stream = new FileInputStream("d:\\earth.xls");
			// 获取Excel文件对象
			rwb = Workbook.getWorkbook(stream);
			// 获取文件的指定工作表 默认的第一个
			Sheet sheet = rwb.getSheet(0);
			// 行数(表头的目录不需要，从1开始)
			for (int i = 1; i < sheet.getRows(); i++) {
				// 创建一个数组 用来存储每一列的值
				String[] str = new String[sheet.getColumns()];
				// 列数
				for (int j = 0; j < sheet.getColumns(); j++) {
					// 获取第i行，第j列的值
					cell = sheet.getCell(j, i);
					str[j] = cell.getContents();
				}
				// 把刚获取的列存入list
				list.add(str);
			}
			for (int i = 0; i < list.size(); i++) {
				String[] str = (String[]) list.get(i);
				Earthquake earthquake = new Earthquake();
				 String timestr = "";
				for (int j = 0; j < str.length; j++) {
					 //System.out.println(str[j]);
					// User user
					String tempstr = str[j];
					//小数点 经纬度处理
					if(tempstr.length()==1 && j<5) {
						tempstr = "0"+tempstr;
					}else if(tempstr.indexOf(".")!=-1 && j==5) {//秒
						tempstr = tempstr.substring(0, 2);
						if(tempstr.indexOf(".")!=-1 || tempstr.length()==1) {
							tempstr ="0"+tempstr.substring(0, 1);
						}
					}else if(tempstr.indexOf(".")!=-1 && (j==6||j==7)) {//纬度 经度
						String latlo[] = tempstr.split("\\.");
						if(latlo[0].length()==2) {
							latlo[0] = "0"+latlo[0];
						}
						if(latlo[1].length()==2) {
							latlo[1] = latlo[1]+"0";
						}else if(latlo[1].length()==1) {
							latlo[1] = latlo[1]+"00";
						}
						tempstr = latlo[0]+"."+latlo[1];
					}else if(tempstr.indexOf(".")==-1 && (j==6||j==7)) {//纬度 经度
						if(tempstr.length()==1) {
							tempstr = "00"+tempstr;
						}else if(tempstr.length()==2) {
							tempstr = "0"+tempstr;
						}
						tempstr = tempstr+".000";
					}
					//给earthquake对象赋值
					if (j == 0  ) {
						timestr = timestr+tempstr+"-";
					} else if (j == 1) {
						timestr = timestr+tempstr+"-";
					} else if (j == 2) {
						timestr= timestr+tempstr+" ";
					} else if (j == 3 || j == 4) {
						timestr= timestr+tempstr+":";
					}else if (j == 5) {
						if(tempstr.length()==1 ) {
							tempstr = "0"+tempstr;
						}
						timestr= timestr+tempstr;
						earthquake.setEqtime(timestr);
						//System.out.println(timestr);
					}else if (j == 6) {
						earthquake.setLatitude(tempstr);//纬度
					}else if (j == 7) {
						earthquake.setLongitude(tempstr);
					}else if (j == 8) {
						earthquake.setDepth(tempstr);
					}else if (j == 9) {
						earthquake.setType (tempstr);
					}else if (j == 10) {
						earthquake.setMagnitude(tempstr);
					}else if (j == 11) {
						earthquake.setEqname(tempstr);
						earthquake.setLocation(tempstr);
					}else if (j == 12) {
						earthquake.setRemark(tempstr);
					}
				}
				if(StringUtils.isNotBlank(earthquake.getEqtime())
						&&StringUtils.isNotBlank(earthquake.getLongitude()))
					earthquake.setCreatetime(new Date());
					earthquake.setCreator("admin");
					earthList.add(earthquake);
			}
			
			System.out.println(earthList.size());
			/*for (Earthquake earthquake : earthList) {
				System.out.println(earthquake.getEqtime() + "a " + earthquake.getLatitude()
						+ "b " + earthquake.getLongitude()+"c ");
			}*/
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return earthList;
		
	}

}
