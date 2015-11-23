package org.module.server.data.orderdata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.module.common.dataservice.MyList;
import org.module.common.dataservice.orderdataservice.MailingListService;
import org.module.common.po.DepartmentPO;
import org.module.common.po.MailingListPO;
import org.module.common.po.OfficeLoadingListPO;
import org.module.common.po.State;
import org.module.server.data.FileHelper;

public class MailingListImpl implements MailingListService{
	private String spt = ":%:%:";
	private String path = "file"+File.separator+"mailingList.txt";
	File file = new File(path);
	FileHelper help = new FileHelper(file);
	public MailingListImpl(){
		
	}
	//觉得有问题
	
	
	public ArrayList<MailingListPO> getAll() {
		
		MyList<MailingListPO> ml = new MyList<MailingListPO>();
		File file = new File(path);
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String record = null;
			while((record = br.readLine()) != null){
				ml.add(new MailingListPO(record.split(spt)));
			}
			br.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return ml;
	}

	public boolean add(MailingListPO o) {
		ArrayList<MailingListPO> ml = new ArrayList<MailingListPO>();
		ml.add(o);
		return help.rewrite(ml);
	}

	public boolean update(MailingListPO newone) {
		// TODO 自动生成的方法存根
		return false;
	}

	public ArrayList<MailingListPO> getByState(State s) {
		// TODO 自动生成的方法存根
		ArrayList<MailingListPO> oal = this.getAll();
		ArrayList<MailingListPO> newone = new ArrayList<MailingListPO>();
		for(MailingListPO a : oal){
			if(a.getState().equals(s)){
				newone.add(a);
			}
		}
		return newone;
		
	}

}
