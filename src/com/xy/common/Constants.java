/**
 *  ClassName: Constants.java
 *  created on 2013-1-24
 *  Copyrights 2013-1-24 hjgang All rights reserved.
 *  site: http://t.qq.com/hjgang2012
 *  email: hjgang@yahoo.cn
 */
package com.xy.common;

import android.os.Environment;

/**
 * @author hjgang
 * @category 全局变量
 * @日期 2013年11月11日
 * @时间 下午 22:46:37
 * @年份 2013
 */
public final class Constants {
	
	// IP,PORT,以及接口链接的调用路径配置
	/** 与服务器端连接的协议名 */
	public static final String PROTOCAL = "http://";
	/** 服务器IP */
	public static final String HOST = "";
	/** 服务器端口号 */
	public static final String PORT = "";
	/** 应用上下文完整路径 */
	public static final String CONTEXTPATH = PROTOCAL + HOST + PORT;

	/** 登录页完整URL路径 */
	public static final String URL_LOGIN = CONTEXTPATH + "";
	/** 注册页完整URL路径 */
	public static final String URL_REGISTER = CONTEXTPATH + "";
	
	/** 系统初始化配置文件名 */
	public static final String SYSTEM_INIT_FILE_NAME = "android_pos_ini";
	public static final String FLAG = "com.android";
	/** 用于标识请求照相功能的activity结果码 */
	public static final int RESULT_CODE_CAMERA = 1;
	/** 图片类型 */
	public static final String IMAGE_UNSPECIFIED = "image/*";
	/** 本地缓存目录 */
	public static final String CACHE_DIR;
	/** 图片缓存目录 */
	public static final String CACHE_DIR_IMAGE;
	/** 待上传图片缓存目录 */
	public static final String CACHE_DIR_UPLOADING_IMG;
	/** 图片目录 */
	public static final String CACHE_IMAGE;
	static {
		if (Environment.MEDIA_MOUNTED.equals(Environment
				.getExternalStorageState())) {
			CACHE_DIR = Environment.getExternalStorageDirectory()
					.getAbsolutePath() + "/Android_pos";
		} else {
			CACHE_DIR = Environment.getRootDirectory().getAbsolutePath()
					+ "/Android_pos";
		}

		CACHE_IMAGE = CACHE_DIR + "/image";
		CACHE_DIR_IMAGE = CACHE_DIR + "/pic";
		CACHE_DIR_UPLOADING_IMG = CACHE_DIR + "/uploading_img";
	}

	private Constants() {
	}

	public static final String[] TESTTYPE = { "一般资料", "性行为及安全套使用-同性性行为",
			"性行为及安全套使用-异性性行为", "性行为及安全套使用-商业性男男性行为-付钱的形式",
			"性行为及安全套使用-商业性男男性行为-得到钱的形式", "药物滥用情况", "性病相关情况", "艾滋病相关知识",
			"相关服务获得" };

	public static final String[] TESTCONTENT = { "1.您的户籍属于", "2.您在当前城市居住时间",
			"3.您的民族", "4.您的婚姻状况", "5.您的学历（包括在读）", "6.您的职业是", "7.您现在的月收入(元)是",
			"8.您认为自己属于下列那种情况?", "9.您所认识的男性同性恋或双性恋人数（人）？",
			"1.您的第一个性伙伴是男性还是女性?【性行为包括口交、阴道交、肛交】", "2.您在第一次与女性发生性行为时有没有使用安全套?",
			"3.您第一次与男性发生性行为时年龄是多少周岁？", "4.您在第一次与男性发生性行为时有没有使用安全套?",
			"5.您寻找性伴侣的场所是？（可多选）", "6.您现在有没有固定性伴侣（维持关系至少3个月）？",
			"7.当前，您最重要的固定伴侣是男性还是女性?", "8.您与固定伴侣的关系维持多长时间了",
			"9.过去6个月内，您与多少位男性发生过性行为【包括肛交、口交】？",
			"9a.过去6月内，您与男性发生性行为时采取的主要行为方式是？",
			"9b.过去6个月内，您与男性发生性行为做1时，使用安全套情况是？",
			"9c.过去6个月内，您与男性发生性行为做0时，使用安全套情况是？",
			"10.过去6个月内，您与男性发生口交性行为，使用安全套的情况是？",
			"11.过去6个月中，您是否曾因喝酒、药物（毒品）使用等原因，而在与男性发生性行为时没有使用安全套？",
			"12.过去6个月内，您是否在与男性发生性行为之前，知晓对方的HIV血清状况？",
			"13.过去6个月内，当您知道对方为HIV阴性，您是否使用安全套？",
			"14.过去6个月内，您是否有过群P的经历（同时与2位或以上的男性发生性行为）？",
			"15.过去6个月内，参与群P中安全套使用情况？", "16.您认为，对于坚持100%使用安全套最大的障碍是？",
			"17.在未来6个月中，假设您有固定男性伴侣，您与固定伴侣使用安全套的情况会是？",
			"18.在未来6个月中，假设您有临时男性伴侣，您使用安全套的情况会是？", "1.过去6个月内，您是否曾与女性发生过性行为？",
			"2.过去6个月内，您与多少位女性发生过性行为？", "3.过去6个月内，您与异性伴侣发生性行为使用安全套的情况是",
			"4.在未来6个月中，假设您有异性性伴侣时，您会使用安全套吗？", "1.过去6个月内，您是否曾通过付钱的形式与男性发生性行为？",
			"2.过去6个月内，您通过付钱与多少位男性发生过性行为？", "3.过去6个月内，您通过付钱与男性发生性行为时的方式为？",
			"3a.做1时，使用安全套的情况是？", "3b.做0时，使用安全套的情况是？",
			"4.在未来6个月中，假设您通过付钱的形式与男性发生性行为，您使用安全套的情况会是？",
			"1.过去6个月内，您是否曾为了得到钱与男性发生性行为？", "2.过去6个月内，您曾为得到钱而与多少位男性发生过性行为？",
			"3.过去6个月内，您为得到钱与男性发生性行为时的方式为？", "3a.做1时，使用安全套的情况是？",
			"3b.做0时，使用安全套的情况是？", "4.在未来6个月中，假设您为得到钱与男性发生性行为，您使用安全套的情况会是？",
			"1.到目前为止，您是否使用过以下物质？（可多选）", "2.您使用此种(这些)物质的主要原因是？",
			"3.过去6个月内，您注射过成瘾性药物（毒品）吗？", "4.过去6个月内，您注射成瘾性药物（毒品）时与别人共用过针具吗？",
			"5.您由于使用成瘾性药物，每月的花费约为多少元。", "6.您是否打算戒除使用成瘾性药物（毒品）的行为或采取替代疗法？",
			"7.您采取戒除使用成瘾性物质（毒品）行为或接受替代疗法的主要原因是？", "8.您的性伴侣中，是否有人使用以上物质？",
			"1.最近6个月内，您是否患过以下疾病？(可多选)",
			"2.过去6个月内，您在与男性发生肛交性行为之后（作为0，被插入方），肛门内或周围发生过出血？",
			"3.过去6个月内，您是否在与男性发生口交性行为（作为0，被插入方）前或之后，口腔内有破溃处？",
			"4.过去6个月内，您在与男性发生性行为过程中，出现过安全套破裂或脱落?",
			"5.过去6个月内，您在使用安全套前留意安全套是否在保质期内？", "6.假使自己有性病/艾滋病，您是否会做下面的事？（可多选）",
			"7.当怀疑自己出现性病相关症状时，您是如何解决的？（可多选）", "1.正确使用安全套可以降低艾滋病传播的危险吗？",
			"2.一个感染了艾滋病病毒的人能从外表看出来吗？", "3.蚊虫叮咬会传播艾滋病病毒吗？",
			"4.与艾滋病感染者或病人一起吃饭会感染艾滋病吗？", "5.只与一个性伴发生性行为，能降低艾滋病传播的危险吗？",
			"6.感染艾滋病病毒的孕妇生下的孩子可能感染艾滋病吗？", "7.输入含有艾滋病毒的血液会得艾滋病吗？",
			"8.与艾滋病病毒感染者共用注射器会感染艾滋病吗？", "9.与感染者握手、拥抱会感染艾滋病吗？",
			"10.咳嗽、打喷嚏会造成艾滋病传播吗？", "11.目前是否可以通过注射疫苗来预防艾滋病病毒感染？",
			"12.您一般通过何种途径获取艾滋病相关知识？（可多选）", "1.过去6个月内，您是否接受过有关预防艾滋病的下列服务？",
			"2.过去6个月内，您是否做过HIV抗体检测?", "3.您不能进行HIV抗体检测的主要原因是？",
			"4.您最近一次进行HIV检测的时间是 ？", "5.您最近一次HIV抗体检测结果是？", "6.您正在接受抗病毒药物治疗？",
			"7.未来6个月内，您是否打算接受HIV抗体检测？" };

	public static final String[] TESTANSWER1 = { "城市", "农村" };
	public static final String[] TESTANSWER2 = { "≤6个月", "7-12个月", "13-18个月",
			"19-24个月", "≥25个月" };
	public static final String[] TESTANSWER3 = { "汉族", "少数民族" };
	public static final String[] TESTANSWER4 = { "未婚", "已婚", "离异", "丧偶",
			"与异性同居", "与同性同居" };
	public static final String[] TESTANSWER5 = { "小学", "初中", "高中及中专", "大专及本科",
			"研究生及以上" };
	public static final String[] TESTANSWER6 = { "无", "有" };
	public static final String[] TESTANSWER7 = { "≤1000", "1001-2000",
			"2001-3000", "3001-4000", "4001-5000", "≥5001" };
	public static final String[] TESTANSWER8 = { "同性恋", "双性恋", "异性恋" };
	public static final String[] TESTANSWER9 = { "没有", "1-5", "6-10", "11-15",
			"≥16" };
	public static final String[] TESTANSWER10 = { "男", "女" };
	public static final String[] TESTANSWER11 = { "有", "没有" };
	public static final String[] TESTANSWER12 = {};
	public static final String[] TESTANSWER13 = { "有", "没有" };
	public static final String[] TESTANSWER14 = { "是", "否" };
	public static final String[] TESTANSWER15 = { "只有固定男性伴侣", "只有固定女性伴侣",
			"既有固定男性伴侣,也有固定女性伴侣", "只有临时性伴侣" };
	public static final String[] TESTANSWER16 = { "男", "女" };
	public static final String[] TESTANSWER17 = { "3-6个月", "7-9个月", "10-12个月",
			"≥13个月" };
	public static final String[] TESTANSWER18 = {};
	public static final String[] TESTANSWER19 = { "以1（插入性行为）为主",
			"以0（被插入性行为）为主", "1和0角色比例相当" };
	public static final String[] TESTANSWER20 = { "从不用", "少于50%", "大约50%",
			"多于50%", "每次都用" };
	public static final String[] TESTANSWER21 = { "从不用", "少于50%", "大约50%",
			"多于50%", "每次都用" };
	public static final String[] TESTANSWER22 = { "从不用", "少于50%", "大约50%",
			"多于50%", "每次都用", "过去6个月内未进行口交行为" };
	public static final String[] TESTANSWER23 = { "是", "否" };
	public static final String[] TESTANSWER24 = { "从不知道", "有时知道", "多数情况知道",
			"总是知道" };
	public static final String[] TESTANSWER25 = { "从不用", "少于50%", "大约50%",
			"多于50%", "每次都用" };
	public static final String[] TESTANSWER26 = { "是", "否" };
	public static final String[] TESTANSWER27 = { "从不使用", "有时使用", "总是使用" };
	public static final String[] TESTANSWER28 = { "认为没有必要使用", "同伴不愿使用",
			"使用安全套是对同伴的不信任", "发生行为时不能获得安全套", "其他原因" };
	public static final String[] TESTANSWER29 = { "不用", "少于50%", "大约50%",
			"多于50%", "每次都用" };
	public static final String[] TESTANSWER30 = { "不用", "少于50%", "大约50%",
			"多于50%", "每次都用" };
	public static final String[] TESTANSWER31 = { "是", "否" };
	public static final String[] TESTANSWER32 = {};
	public static final String[] TESTANSWER33 = { "从不用", "少于50%", "大约50%",
			"多于50%", "每次都用" };
	public static final String[] TESTANSWER34 = { "从不用", "少于50%", "大约50%",
			"多于50%", "每次都用" };
	public static final String[] TESTANSWER35 = { "是", "否" };
	public static final String[] TESTANSWER36 = {};
	public static final String[] TESTANSWER37 = { "以1（插入性行为）为主",
			"以0（被插入性行为）为主", "1和0角色比例相当" };
	public static final String[] TESTANSWER38 = { "从不用", "少于50%", "大约50%",
			"多于50%", "每次都用" };
	public static final String[] TESTANSWER39 = { "从不用", "少于50%", "大约50%",
			"多于50%", "每次都用" };
	public static final String[] TESTANSWER40 = { "不用", "少于50%", "大约50%",
			"多于50%", "每次都用" };
	public static final String[] TESTANSWER41 = { "是", "否" };
	public static final String[] TESTANSWER42 = {};
	public static final String[] TESTANSWER43 = { "以1（插入性行为）为主",
			"以0（被插入性行为）为主", "1和0角色比例相当" };
	public static final String[] TESTANSWER44 = { "从不用", "少于50%", "大约50%",
			"多于50%", "每次都用" };
	public static final String[] TESTANSWER45 = { "从不用", "少于50%", "大约50%",
			"多于50%", "每次都用" };
	public static final String[] TESTANSWER46 = { "不用", "少于50%", "大约50%",
			"多于50%", "每次都用" };
	public static final String[] TESTANSWER47 = {};
	public static final String[] TESTANSWER48 = { "缓解压力", "寻求刺激", "提高性行为兴奋度",
			"其他" };
	public static final String[] TESTANSWER49 = { "是", "否" };
	public static final String[] TESTANSWER50 = { "是", "否" };
	public static final String[] TESTANSWER51 = {};
	public static final String[] TESTANSWER52 = { "未来6个月内没有打算",
			"未来6个月内有戒除或采取替代治疗的打算", "过去1个月内已经开始戒除行为或替代疗法",
			"已经戒除或开始替代疗法，但尚未超过6个月", "已经戒除或持续替代疗法，且已经超过6个月" };
	public static final String[] TESTANSWER53 = { "家人、朋友的告诫", "公司老板的威胁",
			"自己的意愿", "其他原因" };
	public static final String[] TESTANSWER54 = { "是", "否" };
	public static final String[] TESTANSWER55 = {};
	public static final String[] TESTANSWER56 = { "是", "否", "过去6个月内未作为0" };
	public static final String[] TESTANSWER57 = { "是", "否", "过去6个月内未作为0" };
	public static final String[] TESTANSWER58 = { "是", "否" };
	public static final String[] TESTANSWER59 = { "没有", "少于50%", "大约50%",
			"多于50%", "每次都用" };
	public static final String[] TESTANSWER60 = {};
	public static final String[] TESTANSWER61 = { "性病专科门诊就诊", "综合医院就诊",
			"私人诊所就诊", "自行买药治疗", "不作处理", "其他方法" };
	public static final String[] TESTANSWER62 = { "会", "不会", "不知道" };
	public static final String[] TESTANSWER63 = { "可以", "不可以", "不知道" };
	public static final String[] TESTANSWER64 = { "会", "不会", "不知道" };
	public static final String[] TESTANSWER65 = { "会", "不会", "不知道" };
	public static final String[] TESTANSWER66 = { "能", "不能", "不知道" };
	public static final String[] TESTANSWER67 = { "可能", "不能", "不知道" };
	public static final String[] TESTANSWER68 = { "会", "不会", "不知道" };
	public static final String[] TESTANSWER69 = { "会", "不会", "不知道" };
	public static final String[] TESTANSWER70 = { "会", "不会", "不知道" };
	public static final String[] TESTANSWER71 = { "会", "不会", "不知道" };
	public static final String[] TESTANSWER72 = { "可以", "不可以", "不知道" };
	public static final String[] TESTANSWER73 = { "网络", "电视", "报刊书籍", "朋友告知",
			"同志工作组", "卫生人员" };
	public static final String[] TESTANSWER74 = {};
	public static final String[] TESTANSWER75 = { "是", "否" };
	public static final String[] TESTANSWER76 = { "没有必要", "缺乏知识与信息", "担心信息暴露",
			"担心受到歧视", "其他原因" };
	public static final String[] TESTANSWER77 = {};
	public static final String[] TESTANSWER78 = { "阴性", "阳性", "不清楚" };
	public static final String[] TESTANSWER79 = { "是", "否" };
	public static final String[] TESTANSWER80 = { "是", "否" };

	public static final String[] TESTCONTENT_JL = { "1.近一周内，我觉得比平常容易紧张或着急。",
			"2.近一周内，我无缘无故地感到害怕。", "3.近一周内，我容易心里烦乱或觉得的惊恐。",
			"4.近一周内，我觉得我可能将要发疯。", "5.近一周内，我觉得一切都很好，也不会发生什么不幸。",
			"6.近一周内，我手脚发抖打颤。", "7.近一周内，我因为头痛、颈痛和背痛而苦恼。", "8.近一周内，我感觉容易衰弱和疲乏。",
			"9.近一周内，我觉得心平气和，并且容易安静坐着。", "10.近一周内，我觉得心跳地很快。",
			"11.近一周内，我因为一阵阵头晕而苦恼。", "12.近一周内，我有晕倒发作，或觉得要晕倒似的。",
			"13.近一周内，我吸气呼气都感到很容易。", "14.近一周内，我的手脚麻木和刺痛。",
			"15.近一周内，我因为胃痛和消化不良而苦恼。", "16.近一周内，我常常要小便。",
			"17.近一周内，我的手脚常常是干燥温暖的。", "18.近一周内，我脸红发热。",
			"19.近一周内，我容易入睡并且一夜睡得很好。", "20.近一周内，我做恶梦。" };
	public static final String[] TESTCONTENT_YY = { "1.近一周内，我感到情绪沮丧、郁闷。 ",
			"2.近一周内，我感到早晨心情最好。", "3.近一周内，我要哭或想哭。", " 4.近一周内，我夜间睡眠不好。",
			"5.近一周内，我吃饭像平时一样多。", "6.近一周内，我的性功能正常。", "7.近一周内，我感到体重减轻。",
			"8.近一周内，我为便秘烦恼。", "9.近一周内，我的心跳比平时快。", "10.近一周内，我无故感到疲劳。",
			"11.近一周内，我的头脑像往常一样清楚。", "12.近一周内，我做事情像平时一样不感到困难。",
			"13.近一周内，我坐卧不安，难以保持平静。", "14.近一周内，我对未来感到有希望。",
			"15.近一周内，我比平时更容易激怒。", "16.近一周内，我觉得决定什么事很容易。",
			"17.近一周内，我感到自己是有用的和不可缺少的人。", "18.近一周内，我的生活很有意义。",
			"19.近一周内，我认为假若我死了别人会过得更好。", "20.近一周内，我仍旧喜爱自己平时喜爱的东西。" };
	public static final String[] TESTCONTENT_SH = { "1.您有多少关系密切，可以得到支持和帮助的朋友？",
			"2.近一年来您：", "3.您与邻居：", "4.您与同事：", "5.从家庭成员得到的支持和照顾",
			"6.过去，在您遇到急难情况时，曾经得到的经济支持或解决实际问题的帮助的来源有：",
			"7.过去，在您遇到急难情况时，曾经得到的安慰和关心的来源有：", "8.您遇到烦恼时的倾诉方式：",
			"9.您遇到烦恼时的求助方式：", "10.对于团体(如党团组织、宗教组织、工会、学生会等)组织活动，您：" };
	public static final String[] TESTCONTENT_YW = { "1.近一周内，感到自己的精力下降、活动减慢吗?",
			" 2.近一周内，您感到身体某些部位软弱无力吗? ", "3.近一周内，感到头昏眼花或眩晕吗?",
			"4.近一周内，您的性欲减退了吗?", " 5.近一周内，您是否感到记忆力下降? ", "6.近一周内，是否感到事事都很费力?",
			"7.近一周内，您感到寂寞孤独吗? ", "8.近一周内，您感到忧郁苦闷吗? ", "9.近一周内，您对未来感到失望吗?",
			"10.近一周内， 您感到大多数人都不可信任吗? ", "11.近一周内，您感到自己没有什么价值吗? ",
			"12.近一周内，您感到别人不理会您，不同情您吗? ", "13.近一周内，您在单位(家里)地位因吸毒而受影响吗? ",
			"14.近一周内，您要依赖某些物质(酒、药品)才感到舒服吗? ", "15.近一周内，您感到缺乏安全感吗? ",
			"16.近一周内，您感到不自由吗? ", "17.近一周内，您感到自己有罪吗?",
			"18.近一周内，您吸毒给亲友带来了巨大痛苦吗? ", "19.近一周内，您自己吸毒给家庭经济带来严重困难吗?",
			"20.近一周内，流泪或流鼻涕", "21.近一周内，腹部或其他部位肌肉痉挛", "22.近一周内，小腿抽筋",
			"23.近一周内，一阵阵的发冷或发热", "24.近一周内，恶心或呕吐", "25.近一周内，腹泻",
			"26.近一周内，胃痉挛性疼痛", "27.近一周内，出汗", "28.近一周内，发抖", "29.近一周内，呼吸困难",
			"30.近一周内，起鸡皮疙瘩", "31.近一周内，您容易烦恼吗?", "32.近一周内，您容易激动吗?",
			"33.近一周内，您与别人交流容易吗?", "34.近一周内，您能集中注意力吗? ", "35.近一周内，您能适应周围环境吗?",
			"36.近一周内，您能得到家庭的帮助吗? ", "37.近一周内，您能得到朋友的帮助吗? ",
			"38.近一周内，您觉得您的家庭好吗?", "39.近一周内，您食欲怎么样?", "40.近一周内，您睡眠怎么样?",
			"41.近一周内，您对自己的总体健康状况怎样评价?" };
	public static final String[] TESTCONTENT_AQT = { "1.我确信在需要时我会去购买或者领取安全套。",
			"2.每次性生活我（或让同伴）都能使用安全套。", "3.每次性生活我（或让同伴）都会使用新的安全套。",
			"4.即使在兴奋的时候，我（或让同伴）也会使用安全套。", "5.我（或让同伴）能将安全套一直套到阴茎的根部。",
			"6.我能使安全套在性生活过程中不滑脱。", "7.我（或让同伴）能在射精后阴茎疲软之前捏住安全套的开口，并将安全套取出。",
			"8.我能将使用过的安全套打个结（或用纸包住）扔到垃圾筒里。", "9.我能建议对方使用安全套而不担心他怀疑我与他人发生性行为。",
			"10.我能建议对方使用安全套，而不担心他怀疑我得了性病。", "11.即使不清楚对方对安全套的看法，我也会与对方讨论使用安全套。",
			"12.我能建议对方使用安全套，而不担心他认为我不信任他。", "13.我能说服对方使用安全套。",
			"14.如果对方拒绝使用安全套，我会拒绝与其发生性行为。" };

	public static final String[] TESTANSWER_JL1_20 = { "没有或很少时间 ", "少部分时间",
			"相当多时间 ", "绝大部分或全部时间" };

	public static final String[] TESTANSWER_YY1_20 = { "从来没有或偶尔", "有时", "经常",
			"总是如此" };

	public static final String[] TESTANSWER_SH1 = { "一个也没有", "1-2个", "3-5个",
			"6个或以上" };
	public static final String[] TESTANSWER_SH2 = { "远离家人，且独居一室",
			"住处经常变动，多数时间和陌生人住在一起", "和同学、同事或朋友住在一起", "和家人住在一起" };
	public static final String[] TESTANSWER_SH3 = { "相互之间从不关心，只是点头之交",
			"遇到困难可能稍微关心", "有些邻居都很关心您", "大多数邻居都很关心您" };
	public static final String[] TESTANSWER_SH4 = { "相互之间从不关心，只是点头之交",
			"遇到困难可能稍微关心", "有些同事都很关心您", "大多数同事都很关心您" };
	public static final String[] TESTANSWER_SH5 = {};
	public static final String[] TESTANSWER_SH6 = {};
	public static final String[] TESTANSWER_SH7 = {};
	public static final String[] TESTANSWER_SH8 = { "从不向任何人诉述",
			"只向关系极为密切的1—2个人诉述", "如果朋友主动询问您会说出", "主动诉述自己的烦恼，以获得支持和理解" };
	public static final String[] TESTANSWER_SH9 = { "只靠自己，不接受别人帮助", "很少请求别人帮助",
			"有时请求别人帮助", "有困难时经常向家人、亲友、组织求援" };
	public static final String[] TESTANSWER_SH10 = { "从不参加", "偶尔参加", "经常参加",
			"主动参加并积极活动" };

	public static final String[] TESTANSWER_YW1_30 = { "严重", "较重", "中等", "很轻 ",
			"没有" };
	public static final String[] TESTANSWER_YW31_33 = { "非常容易", "很容易", "容易",
			"有点容易", "根本不容易" };
	public static final String[] TESTANSWER_YW34_37 = { "极能", "很能", "中等能",
			"有点能", "根本不能" };
	public static final String[] TESTANSWER_YW38_41 = { "很好", "好", "不好也不差",
			"差", "很差" };

	public static final String[] TESTANSWER_AQT1_14 = { "完全没有信心 ", "没有信心",
			"不确定", " 有信心", "非常有信心" };

	public static final String[] MYJGZX_ADDRESS = { "湖南省长沙市芙蓉区火星镇纬二路149号",
			"湖南省长沙市岳麓区桐梓坡路138号中南大学湘雅三医院医技楼检验科", "湖南省长沙市芙蓉中路1段450号",
			"定王台公交站定王大厦盘旁斜坡中段金沙里社区卫生站", "长沙市岳麓区银盆南路273号岳麓区人力资源市场",
			"长沙市浏城桥水絮塘巷67号", "长沙市开福区捞刀河镇高源村", "长沙市人民中路139号",
			"长沙市坡子街94号金世界布市三楼", "长沙市马王堆新桥沁园D4栋101号", "浏阳市淮川办事处北岭路12号" };

	public static final String[] MYJGZX_PHONE = { "0731-84723626",
			"400-000-1201", "0731-88852136", "82233347", "86678132",
			"86656689", "85292171", "0731-85134120", "0731-82868122",
			"0731-83673941" };

	public static final String[] MYJGZX_NETSITE = { "www.cscdc.gov.cn",
			"http://www.hncdc.com" };

	public static final String[] MYJGZX_BUS = {
			"乘705路到纬二路站下车；603路、112路、139路到凌宵路东下车向南行100米；405路、110路、103路、126路、127路、502路、908路到紫薇路站下车，沿紫薇路北行200米",
			"乘坐102路、109路、118路、149路、301区间线、301路、348路、405路、66路、704路、903区间线、913路 到湘雅三医院下车" };

	public static final String[] MODEL_IDS = { "1", "2", "3", "4", "5", "6" };
	public static final String[] MODEL_TITTLES = { "HIV检测", "安全套使用", "抗病毒药物治疗", "性传播疾病",
			"药物滥用", "预防性用药" };
	public static final String[] TIP1_TITTLES = { "什么是艾滋病窗口期？", "窗口期如何计算？",
			"不同的感染途径会不会影响窗口期的长短？", "什么是艾滋病自愿咨询检测（VCT）?", "艾滋病自愿咨询检测的目的是什么？",
			"艾滋病自愿咨询检测的作用是什么？", "服药、生病是否影响艾滋病病毒抗体检测结果？",
			"注射过乙肝、狂犬病疫苗是否影响艾滋病病毒抗体检测结果？", "进行艾滋病病毒抗体检测前是否需要空腹、禁食等？",
			"哪些机构可以提供艾滋病病毒检测服务？", "我国常规的艾滋病病毒抗体检测程序是什么？",
			"高危行为后不久出现一些“急性期症状”，是否说明感染了艾滋病病毒？" };
	public static final String[] TIP1_CONTENTS = {
			"艾滋病毒进入人体后，需要经过一段时间血液才会产生艾滋病毒抗体，在此期间抗体检测呈阴性，这段时间即为窗口期。感染者体内的HIV数量会在这时达到一个峰值，传染性极强。急性感染期也出现在这段时间。多数人在感染艾滋病毒后有3至12周“窗口期”，在此期间，人体仍在产生艾滋病毒抗体，但这些抗体尚无法测出。这一最初感染期感染性最强，但在各感染期都可能会传播艾滋病毒。3个月后，即在感染者体内有足够时间产生抗体后，应进行复检，以证实初检结果。",
			"窗口期的计算应从高危行为之时（或是接受输血之时）算起，也就是说，如果1月1号发生高危性行为或是接受输血，那么，接受抗体检测的时间应该是从1月1号算起6周后，也就是2月12日。",
			"艾滋病前期或感染并无特定病症。 现时使用的抗体测试是测验身体中有否艾滋病毒抗体存在。不同途径的感染可能感染不同的亚型(subtype). 但都可在窗口期后的抗体测试中检测出来。同时，进入体内的HIV数量多寡也不会影响窗口期的长短。也就是说，不论是输血感染、性交感染、哺乳感染或其它形式的感染，也不论感染的HIV多少，一般都会在窗口期后出现抗体阳性反应。除极少特例外，不存在有的特定感染窗口期长而有的特定感染短的现象。",
			"艾滋病自愿咨询检测是指人们通过咨询，在充分知情和完全保密的情况下，自愿选择是否接受艾滋病病毒抗体检测、改变危险行为及获得相关服务的过程。VCT已成为许多艾滋病预防控制工作，如艾滋病抗病毒治疗、预防母婴传播、行为干预、关怀、减少歧视等项目的切入点和枢纽，成为世界各国艾滋病预防的重要公共卫生策略之一。",
			"艾滋病自愿咨询检测的目的是：（1）通过艾滋病病毒抗体检测服务的提供，发现艾滋病病毒感染者和艾滋病病人；（2）通过艾滋病咨询服务的提供，使求询者得到情感和心理上的支持和行为指导，促使HIV抗体检测阳性者或阴性者改变危险行为，预防艾滋病病毒新感染的发生，控制艾滋病的流行；（3）通过艾滋病转介服务的提供，使艾滋病病毒抗体检测阳性者及早获得适当的治疗、关怀支持与帮助，以及母婴阻断干预和母婴传播预防服务。",
			"VCT的作用概括起来有以下几点　　1、帮助更多的人接受有关艾滋病和艾滋病病毒检测的基本知识，在知情同意的前提下自愿接受检测并能获取检测的结果；2、促使高危人群改变/降低危险行为，减少艾滋病病毒的传播；3、为那些担心自己感染艾滋病病毒的人提供了一个与医务人员或其他人接触的机会，有利于获得有关医疗服务的信息。帮助他们了解国家有关政策和本地各种服务的相关信息，使求询者能及早获得有关治疗、关怀、预防等方面的服务和支持，减少艾滋病对个人、家庭以及社会经济发展的不良影响；4、及时发现感染艾滋病病毒的孕产妇，帮助孕产妇做出最有益的选择，减少艾滋病对母婴健康的危害；5、作为艾滋病治疗、关怀和预防工作的切入点和枢纽，为高危人群和重点人群提供心理、情感支持与转介服务；同时，有利于加强艾滋病检测、治疗、关怀和预防等各部门、各机构之间的联系，促进艾滋病防治各部门的配合与工作的开展。",
			"艾滋病病毒抗体的测定是特异性的，而且抗体水平不受体温、药物等的影响。因而，一般性的服药、生病不会影响艾滋病病毒抗体的检测。",
			"目前最常用的艾滋病病毒抗体酶联免疫试剂酶标记物为特异性的艾滋病病毒抗原，保证了检测的高特异性和敏感性。因而，注射过乙肝、狂犬及其它疫苗不会影响艾滋病病毒抗体检测结果。",
			"艾滋病病毒抗体检测是定性试验而非定量试验，该试验不受饮食和药物的影响，因而检测前不需空腹、禁食。",
			"我国各省、市级疾病控制中心（或卫生防疫站）、县级以上医院、出入境检验检疫机构、各级血站和血液中心以及皮肤病性病防治所等都设有艾滋病病毒检测筛查实验室，均可从事艾滋病病毒抗体检测。目前，大部分省、直辖市、自治区都至少有一个确认实验室，一般设在省级疾病预防与控制中心，负责本省阳性标本的复核和确认工作。上述机构在提供艾滋病病毒抗体检测的同时，也提供有关艾滋病方面的咨询，包括电话咨询、信函咨询和门诊咨询等。",
			"我国常规艾滋病病毒抗体检测包括初筛试验和确认试验。凡初筛试验阳性者必须做确认试验，确认试验阳性者方可诊断为艾滋病病毒感染。确认试验只能在具有艾滋病病毒确认资格的实验室内进行。",
			"感染了艾滋病病毒会出现一些症状，但有了类似症状并不代表感染了艾滋病病毒。诊断艾滋病病毒感染首先要考虑的是流行病学史，即是否有过高危行为，但做出诊断依据的是实验室检测结果。由于艾滋病病毒感染的症状没有特异性，没有一个症状是与艾滋病病毒感染一一对应，因此不能只根据发热、腹泻、肺炎、乏力、皮疹、鹅口疮等一两个症状就断定感染了艾滋病病毒。目前唯一的诊断依据是艾滋病病毒的实验室诊断，即艾滋病病毒抗体的检测。所以对于那些仅根据症状就怀疑甚至于断定感染艾滋病病毒的“感染者”来说，完全没有必要抓住那些仅有的证据到处咨询。想得到确定结果的唯一方法就是到具备诊断资格的医疗机构进行实验室检测。" };

	public static final String[] TIP2_TITTLES = { "STDs如何传播？", " 安全套如何发挥作用？",
			"为什么使用安全套仍会感染？", " 如何坚持和正确使用安全套？" };
	public static final String[] TIP2_CONTENTS = {
			"STDs的传播主要有两种途径，对于HIV、淋病、衣原体、阴道滴虫病等，是由感染的尿道或阴道分泌物与粘膜接触，如男性的直肠粘膜、女性的阴道粘膜或宫颈粘膜的；对于生殖器溃疡，如生殖器疱疹、梅毒、软下疳等，以及HPV感染（生殖器疣和宫颈癌）主要是由与被感染的皮肤或粘膜接触所致。",
			"与其他人相比，MSM的HIV感染率是其他人的38-75倍，梅毒感染率是63-100倍。安全套基于疾病或感染的传播途径，起到不同的保护作用，安全套使用，使病原体不能渗透。且很多研究均发现，对于性伴侣一方有感染情况，而另一方为阴性时，坚持使用安全套对预防感染高度有效。男士安全套不能对所有的感染起到保护作用，如对于仅通过生殖器分泌物传播的疾病，保护作用更好，如淋病、衣原体、阴道滴虫病以及HIV；相对来讲，主要通过皮肤接触传播的感染可能会有未保护到的区域，如生殖器疱疹、HPV、梅毒以及软下疳等，因此仅在感染部位或潜在的暴露部位受到保护时有效。",
			"安全套使用时预防HIV感染危险的有效方法。但并不是说100%有效，禁欲、与同一位未感染者性行为是更为有效的方法，然而，由于症状的隐匿性，许多人并不知道自己已经被感染。安全套保护作用失败通常是由于没有坚持使用或没能正确使用。没能坚持使用安全套可以导致STDs，因为仅一次与感染者发生性行为，就可能被感染；没能正确使用安全套会使其保护作用消失，导致安全套破裂、脱落、漏出等，不正确使用包括从性行为开始到结束的任一时刻。",
			"在每次性行为（阴道交、肛交、口交)时都要全程使用安全套，在性接触之前，将安全套自阴茎头卷边；如果安全套没有储精囊，在头部留出约1.5厘米收集精液；在射精之后或在阴茎变软之前，握住安全套边缘小心撤出，摘掉安全套时要确保没有精液漏出；包住安全套遗弃并确保其他人不能接触；如在性行为过程中感到安全套破裂，应立即停止，更换；在肛交或阴道交使用安全套时，确保充足的润滑油使用，一般选用水性润滑剂，而不选用油性润滑剂，因其能腐蚀橡胶，破坏安全套。" };

	public static final String[] TIP3_TITTLES = { "抗病毒治疗（ART）", "病毒抑制", "启动抗病毒治疗", "一线治疗方案",
			"坚持服药", "治疗期间的注意事项", "HIV管理阶段", "预防合并感染" };
	public static final String[] TIP3_CONTENTS = {
			"是目前艾滋病最主要的治疗方法，通常一旦启动治疗就需要在保证良好依从性的前提下终生服药。它能最大限度地抑制病毒复制，保存和恢复免疫功能，降低病死率和艾滋病相关性疾病的发病率，提高患者的生活质量，减少艾滋病的传播。ART指联合应用三种或三种以上抗病毒药物以实现抑制病毒的效果。",
			"病毒抑制是即指抗病毒治疗的目的是保持病毒载量始终处于低于目前试验检测方法可检测到的水平，通常低于50拷贝/毫升。目前世卫组织关于治疗失败的病毒载量标准是大于等于1000拷贝/毫升。推荐将病毒载量检测作为监测抗病毒治疗取得成功或失败的首选方法。",
			"作为重点，应对所有严重或晚期艾滋病（根据世卫组织标准处于临床三期或四期）患者和CD4+T淋巴细胞计数等于或低于350个/mm3者启动抗病毒治疗。无论CD4+T淋巴细胞计数结果或WHO临床分期如何，都应当启动抗病毒治疗者包括：• 活动性结核病患者• 合并感染乙肝病毒的重症慢性肝病患者• 感染HIV的孕妇和哺乳妇女• HIV单阳配偶中的感染方（以降低HIV传播风险）",
			"一线抗病毒治疗应当包含两种核苷类逆转录酶抑制剂（NRTI）以及一种非核苷类逆转录酶抑制剂（NNRTI）。 推荐采用TDF＋3TC(或FTC)＋EFV（即 替诺福韦+拉米夫定或恩曲他滨+依曲韦林）固定剂量联合用药作为启动抗病毒治疗的首选方案。当一线抗病毒治疗效果不佳时，更换抗病毒药物，或转变为二线治疗方案。",
			"一定要认识到，坚持服药对抗病毒与预防HIV传播至关重要，停止服药后保护作用会迅速降低甚至消失，所以一定要坚持每天服药。一线抗病毒治疗方案具有抑制病毒和修复免疫系统的最佳效果，而要成功实现治疗效果则需要他们完全按照处方要求服用药物。需要知道许多副作用是暂时的，并可治疗处理。",
			"尽管抗病毒药物可以降低HIV传播的风险，但不能完全依靠抗病毒治疗来预防他人感染HIV。应建议他们采取安全性行为（包括使用安全套），避免诸如共用针具等其他高危行为，以防止将HIV传播给他人。研究显示，如果坚持并正确使用男用安全套，可至少减少80%的异性传播，并可为64%在男男同性恋人群中进行的肛交行为提供保护。",
			"HIV血清学检测——若为阳性，需要每6个月进行CD4+T淋巴细胞计数检测——根据检测结果，由医生确定是否启动抗病毒治疗——接受抗病毒治疗过程中，每6个月进行CD4+T淋巴细胞计数检测；并于启动治疗6个月后进行HIV病毒载量检测，之后每一年检测一次——根据CD4+T淋巴细胞计数检测、HIV病毒载量确定抗病毒治疗是否有效。",
			"肺结核感染；隐球菌感染；乙肝、丙肝病毒感染；" };

	public static final String[] TIP4_TITTLES = { "什么是性传播疾病（STDs）？", "是否有STDs的危险？",
			"STDs是如何传播的？", "如何知道自己患有STDs？", "STDs能否治愈？", "如何进行自我保护？" };
	public static final String[] TIP4_CONTENTS = {
			"是指可以通过亲密接触或性行为进行传播的疾病。如梅毒、淋病、尖锐湿疣、生殖器疱疹、艾滋病等疾病.",
			"每位进行性行为的人都有可能患病，但性生活活跃的男性同性恋、双性恋或其他与男性发生性行为的人患病危险更大：随着MSM人群中的HIV和STDs发生率增加，接触到患病的同伴可能性更大，从而自身感染的可能性亦增大；特定性为，如未坚持使用安全套，会增加感染风险；",
			"STDs可以通过与患病人发生性接触传播，性接触包括口交、肛交、阴道交以及生殖器-皮肤接触等。",
			"即使患病，也可能 没有症状或体征出现，所以自己（和同伴）可能在不知情的情况下已经感染。唯一能够明确自身感染状况的方法是进行检测，如患有生殖器疱疹等性传播疾病能够增加HIV感染几率，所以进行检测是保护自己（和同伴）的重要方法。对于性生活活跃的男性同性恋、双性恋等人群，推荐：HIV检测至少每年进行一次；梅毒检测；乙型肝炎、丙型肝炎检测；对于过去一年内有过(被)插入性行为者，支原体和淋病球菌检测；对于过去一年内发生过口交性行为者，淋病球菌检测；疱疹病毒检测等。（在就诊时，请如实向卫生人员陈述性行为史，已得到最佳治疗。）",
			"一些STDs（如淋病、衣原体、梅毒）能够由药物治愈。不管如何进行治疗，一定要确保完成医嘱药物。请谨记：每一次的不安全性行为（不使用安全套）或者与患有STDs的人进行性行为都有可能导致患相同或不同的性传播疾病。",
			"对于每一位性生活活跃的人来说，都意味着有很大感染性传播疾病（STDs）的危险，通过了解STDs的传播方式及相关知识能够降低感染危险。接种疫苗;对于男同性恋、双性恋或其他MSM者来说，感染甲型肝炎、乙型肝炎和人类乳头瘤病毒（HPV）的危险性较大，所以应接种甲型乙型肝炎疫苗，对于26岁以上者，还应接种HPV疫苗。保持安全性：定期检测与疫苗接种十分重要，此外还用注意其他减少危险的行为：与性伴侣坦诚告知STDs情况，性行为前进行检测；正确使用安全套，并坚持100% 使用安全套；尽可能不在饮酒或使用药物（毒品）的情况下进行性行为，因为这些行为能够降低自身的决策能力，从而导致不安全性行为（不使用安全套）增加；减少性伴数， 仅与一位性伴侣发生性关系能够降低STDs感染风险。" };

	public static final String[] TIP5_TITTLES = { "成瘾性物质（毒品使用)与HIV感染", "使用成瘾性物质（毒品使用）的影响",
			"使用成瘾性物质HIV感染风险增加的原因", "常见的成瘾性物质", "注射吸毒者（IDU）", "阿片类药物", "美沙酮维持治疗" };
	public static final String[] TIP5_CONTENTS = {
			"使用成瘾性物质（毒品使用)与HIV感染密切相关。毒品注射是HIV传播的直接途径，同时，吸食如酒精、可卡因、冰毒等物质亦会增加HIV的感染风险。物质滥用会导致使用者抑制力降低，不安全性行为发生增加，从而增加HIV感染发生。",
			"使用成瘾性物质（毒品使用）是一个重要的公共卫生问题。不仅直接增加HIV感染风险，物质滥用会影响个体的整体健康状况，使之对HIV的感染更为敏感；对于已经感染了HIV的人来说，物质滥用会加速疾病进程，并对治疗依从性产生负面影响。",
			"不安全性行为：使用成瘾性物质能够降低抑制力，增加不安全性行为，包括不使用安全套。遭受羞辱与歧视：多数情况，使用成瘾性物质通常被视为违法行为，而不是需要咨询和康复服务的医学问题。歧视会导致物质滥用者不去寻求HIV检测、关怀与治疗。",
			"酒精：过度的酒精使用，尤其是酗酒，与众多不良的健康和社会状况有关，而且可以导致其他的物质滥用。酒精使用会增加HIV感染风险是由于其可以导致安全套使用降低、性伴数增多等。可卡因：是能够造成短时间兴奋的、令人上瘾的物质。毒性较大，易于成瘾，小剂量时能产生兴奋作用，产生欣快感，随着剂量增大，使兴奋呼吸、血管和呕吐中枢，严重者可发生惊厥；大剂量可产生抑制作用，出现呼吸抑制和心力衰竭等严重症状。且由于毒品使用可以在短时间内将使用者的从钱财消耗，部分使用者可能被迫选择通过性行为获得钱财购买毒品，而这会增加HIV感染风险：与不使用毒品的人相比较，使用者：有更多数量的性伴侣；较低的安全套使用率；更可能使用多种物质（毒品）；对预防HIV的活动反应消极。冰毒：冰毒使用与HIV感染风险增加相关联，同酒精和其他毒品一样，它也会令使用者产生高危性行为和临时性半数增加。而且：极易成瘾，并且可以注射使用；它能够使阴茎以及肛门、阴道的粘膜组织变干，从而在性行为过程中易造成破损，增加HIV感染风险。",
			"共用注射器、不安全性行为、为得到钱而进行的性行为、与注射吸毒者（IDU）进行性行为、害怕受到歧视而不进行HIV检测、心理压力过大而选择吸毒等，均是注射吸毒者HIV传播与感染的危险行为。对于不能停止注射的人来说，需要注意的是，一定要保证使用无菌注射器，不能重复使用注射器和针头以及其他注射用具；而且，使用消毒剂对使用过的注射器消毒，亦不安全。",
			"阿片类药物主要包括海洛因、鸦片、可待因、吗啡、芬太尼、哌替啶(度冷丁)和曲马多等。反复使用阿片类物质将引起机体耐受成瘾，阿片类物质的成瘾的症状包括渴求、焦虑、心境恶劣、打哈欠、出汗、起鸡皮疙瘩、流泪、流涕、恶心或呕吐、腹泻、痛性痉挛、肌肉疼痛、发热和失眠等。",
			"美沙酮维持治疗（MMT） 是针对阿片类药物依赖的一种替代治疗方法。这种方法要求吸毒人员每天到指定地点，在工作人员监督下口服一定剂量的美沙酮，从而减少非法毒品的使用和相关高危行为的发生。通过口服美沙酮可降低静脉注射阿片依赖药物的频次，改善吸毒者的身体功能及生活质量，进而减少了感染艾滋病病毒、病毒性肝炎等疾病的可能性。美沙酮维持治疗通过较长时期或长期服用美沙酮口服液来缓解因为停止使用毒品而出现的生理症状和药物渴求，同时配合心理治疗、行为干预等综合措施，以最终达到减少毒品危害和需求的目的。服用美沙酮口服液可以有效地控制海洛因、鸦片毒瘾达24至36小时。美沙酮维持治疗的意义（1） 每天只需要服用一次美沙酮口服液（10元/次），就可以使病人免遭阶段症状的困扰；（2） 降低维持治疗者毒品的渴求，减少觅药和用药行为；（3） 减少注射毒品的行为，并减少了通过共用注射器传播血源性疾病（特别是艾滋病）的机会；（4） 与病人保持联系，以便为他们提供防病知识、社会支持、心理辅导，鼓励他们逐渐戒除毒品。 参加美沙酮维持治疗条件（1）使用阿片类物质病史1年以上；（2）年龄在18周岁以上；（3）两次脱毒治疗失败，间隔在一个月以上；" };

	public static final String[] TIP6_TITTLES = {
			"什么是暴露前预防用药（PrEP，pre-exposure prophylaxis）？", "为什么使用PrEP？",
			"PrEP是不是疫苗？", "是否考虑使用？", "PrEP如何发挥作用？", "使用是否安全？", "如何开始PrEP？",
			"是否使用PrEP，就可以代替使用安全套？", "需要服用多长时间？", "服用PrEP多长时间之后有效？",
			"能够随意停药和服用？", "PrEP能否在暴露之后服用？" };
	public static final String[] TIP6_CONTENTS = {
			"暴露前预防用药是指有高感染危险性的HIV阴性者，服用抗病毒药物以预防HIV感染。PrEP目前被推荐用于MSM、异性恋、DIU等人群中。此药与HIV感染者用药成分相同。2012-7-6，特鲁瓦达（Truvada)被美国食品药品管理局（FDA）认证为唯一的预防前用药。生产公司：Gilead Sciences.",
			"HIV感染目前没有治愈手段和有效的疫苗，所以预防是关键。需要注意的是，PrEP需要持续用药，每日一次，且PrEP的使用不能代替安全套等预防方式，同时还需与其他措施结合使用，如安全套等。",
			"不是。与疫苗注射产生抗体能够持续有效几年不同，PrEP是需要每日口服。特鲁瓦达是两种药物的合成(tenofovir and emtricitabine)，每日服用才能够保持血药浓度，防止感染和HIV的全身性蔓延，如果没能每日服用，则不能起到此效果。",
			"对于性传播来说，包括与HIV阳性伴侣保持关系，多性伴者，同性恋或双性恋者过去6个月中曾被诊断为STD且进行无保护性行为者，与有感染危险性但不知其血清状况的伴侣（如静脉吸毒者或有双性伴侣者）进行无保护性行为者。对于静脉吸毒者（包括过去6个月内使用注射毒品、与他人共用注射器、或进行替代治疗者）需要使用；对异性恋者中一方HIV阳性，阴性者PrEP的预防性用药可以作为妊娠期防止感染的方法之一。对于使用PrEP者来说，需要每天服用，每3个月进行一次HIV检测、拿药和随访。",
			"有研究显示PrEP能够降低HIV感染风险，对于持续使用者来说，相较于未用药者可降低92%的感染风险。",
			"临床研究中，一些PrEP的服用者早期出现如肠胃不适、食欲不振等副作用，但一般为轻度症状且多数在第一个月之后消失。亦有一部分人出现轻度头痛，但尚未发现严重的副作用。当出现其他症状或症状持续不退时，应当告知卫生保健提供者。",
			"当认为自己有很大的感染HIV危险时，应与专业卫生人员商议，若双方均认为PrEP能够降低HIV感染风险时，卫生人员将为服务对象提供检查以确保其肝肾功能正常，如检查结果显示服药安全，卫生人员将开处方；若服务对象没有医疗保险，卫生人员将提供药物援助项目的咨询；如选择服用PrEP，需要定期接受卫生人员随访、血液检查进行HIV检测及确认身体对药物的反应，并就性行为和注射毒品等危险行为进行咨询；坚持每天服药很关键，服药者需接受相关建议以确保药物降低HIV感染风险的有效性，有服药困难者需要向卫生人员说明情况并取得帮助。",
			"不是。即使每日服用PrEP，仍要需要使用安全套，虽然PrEP能够预防HIV感染，但同每次正确使用安全套一样，两者都不是100%有效。而且PrEP不能预防通过性行为感染其他疾病（如淋病、衣原体感染、肝炎等），但安全套则对此有效。所以各种方法结合能够更为有效的降低HIV及其他性传播疾病的感染。",
			"与卫生人员商议是否可以停止服用PrEP，一般有以下几种原因：如果因为生活方式的改变使自身感染HIV的危险性降低；如果认为自己不想每日服药或经常忘记服药，应用其他的方法更为适合；如果药物产生的副作用影响到日常生活，或血液检查显示身体对于药物反应不良，卫生人员会选择停止使用药物。",
			"研究人员尚未找到确切答案以明确在服药开始后多长时间能够切实有效。有研究显示，如果每日按时按量服药，能够在20天后使血液药物浓度达到最大保护作用，服药7天后药物可达到直肠组织，20天后达到阴道组织。服药者需与卫生人员讨论以评估自己需多长时间可达到效果。",
			"不可以。一部分人认为自己可以连续服药几天或几周，然后停药一段时间再继续服药，我们称之为间歇性服药。所有的研究均显示停止服药后，PrEP的预防作用将迅速降低，必须要每日服药以达到最好的保护作用。",
			"不可以。PrEP仅对有HIV感染危险的阴性人群有效。对于有过单次危险事件或潜在HIV感染的人群，如未使用安全套的性行为、共用注射器或性侵等，可使用另外一种预防方法，称之为暴露后预防用药（PEP），且必须在暴露后72小时内使用。1. 什么是暴露后预防用药（PEP，post-exposure prophylaxis）？暴露后预防用药（PEP）是指对可能暴露于HIV的高危性行为、共用注射器、意外针刺等情况的HIV阴性者，连续28天使用抗病毒药物来预防感染，PEP需要在可能暴露后的72小时内使用。PEP是在单次高危行为之后服用抗病毒药物阻止HIV的复制和扩散至全身，应尽快服用，一般为可能性暴露后的3天内。但PEP并不是100%有效。2. PEP使用是否适合？用于近期内单次HIV暴露，而非经常暴露。需要同卫生人员商讨，根据暴露的危险性确定是否服用PEP。卫生人员在接触到HIV感染者的血液或体液后亦考虑使用PEP，此种方式将HIV感染率降低到1%以下。对于非卫生人员，暴露后预防用药（PEP）是指对可能暴露于HIV的高危性行为、共用注射器、意外针刺等情况的HIV阴性者，28天使用抗病毒药物来预防感染，PEP须要在可能暴露后的72小时内使用。如果服用PEP，需要在第4-6周、3个月、6个月之后进行HIV检测，因为PEP并非100%有效，仍然需要使用安全套、禁止与他人通用注射器等。3. 何时使用PEP？研究显示在暴露后72小时之后使用PEP效果很小或没有，HIV病毒在进入身体后会迅速复制，一般在3天后遍布全身，而PEP仅在体内HIV数量较少时有效。4. PEP是否产生副作用？PEP使用较为安全，在部分人身上可能出现恶心等副作用，但可以治愈且无生命威胁。5. 从那里得到PEP？可以从医生诊所、急诊室、紧急治疗诊所或当地的HIV诊所获得。6. 是否在每次不安全性行为之后服用PEP即可？不是。PEP仅在非通常情况下、潜在HIV暴露时即刻使用，但如果经常暴露于HIV，此方法并不是正确选择。因为如果PEP仅在暴露后使用，就需要更多的剂量来阻止感染的发生，并不像暴露之前已连续用药。如果处于持续的暴露危险中，可考虑PrEP。" };

}
