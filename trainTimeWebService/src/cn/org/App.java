package cn.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import cn.org.GetStationNameDataSetResponse.GetStationNameDataSetResult;
//woshishui
public class App {

	public static void main(String[] args) {

		TrainTimeWebService tt = new TrainTimeWebService();
		TrainTimeWebServiceSoap soap = tt.getTrainTimeWebServiceSoap();
//		ArrayOfString stationName = soap.getStationName();

//		List<String> string = stationName.getString();
//		for (String string2 : string) {
//			System.out.println(string2);
//		}

//		//��ñ���ʱ�̱�Web Services֧�ֵ�ȫ��վ̨���ƺ�ƴ����д DataSet
        GetStationNameDataSetResult dataSet = soap.getStationNameDataSet();
//        List<Object> listds = dataSet.getAny();
        System.out.println();

	}

}
