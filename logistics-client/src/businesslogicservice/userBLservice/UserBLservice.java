package businesslogicservice.userBLservice;

import vo.UserVO;

public interface UserBLservice {

	/**
	 * ǰ�ã��û����ڣ�������ȷ��ѡ����ȷ���û�����
	 * ���ã���¼
	 * ����: UserDataService.allUsers ���������˺���Ϣ
	 * @param u
	 * @return
	 */
	public boolean login(UserVO u);
	/**
	 * ǰ�ã�����Աѡ���û�ɾ��
	 * ���ã�����
	 * ����: UserDataService.delete ɾ��һ���˺�PO
	 * @param u
	 * @return
	 */
	public boolean deleteUser(UserVO u);
	/**
	 * ǰ�ã����������û�
	 * ���ã�����
	 * ����: UserDataService.add ����һ���˺�PO
	 * @param u
	 * @return
	 */
	public boolean addUser(UserVO u);
	/**
	 * ǰ�ã��û������˻���Ϣ
	 * ���ã�����
	 * ����: UserDataService.update �޸�һ���˺���Ϣ
	 * @param u
	 * @return
	 */
	public boolean update(UserVO u);
}