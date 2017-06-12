public class VersionComparison {
	public static void main(String[] args){
		System.out.println(compareVersion("01","1"));
	}
	public static int compareVersion(String a, String b) {
	    String[] version1 = a.split("\\.");
	    String[] version2 = b.split("\\.");
		int len1 = version1.length;
		int len2 = version2.length;
		int result = 0;
		Boolean flag = false;
		int len = (len1>len2)?len2:len1;
	    for(int i=0;i<len1;i++){
			while(version1[i].startsWith("0") && version1[i].length()!=1){
				version1[i] = version1[i].substring(1);
			}
			//System.out.println(version1[i]);
		}
	        
	    for(int i=0;i<len2;i++){
			while(version2[i].startsWith("0") && version2[i].length()!=1){
				version2[i] = version2[i].substring(1);
			}
			//System.out.println(version2[i]);
		}
		for(int i=0;i<len;i++){
			if(Long.parseLong(version1[i])>Long.parseLong(version2[i])) {
				result = 1;
				flag = false;
				break;
			}
			else if(Long.parseLong(version1[i])<Long.parseLong(version2[i])) {
				result = -1;
				flag = false;
				break;
			}
			else if(Long.parseLong(version1[i]) == Long.parseLong(version2[i])) {
				flag = true;
				continue;
			}
		}
		if(flag == true){
			if(len1>len){
				for(int i=len;i<len1;i++){
					if(Long.parseLong(version1[i])>0){
						result=1;
						break;
					}
				}
			}
			if(len2>len){
				for(int i=len;i<len2;i++){
					if(Long.parseLong(version2[i])>0){
						result=-1;
						break;
					}
				}
			}
		}
	    return result;
	}
}
