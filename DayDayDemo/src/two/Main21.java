package two;

import entity.JlSupEquipmentCheckTbl;

/**
 * @Classname two.Main21
 * @Date 2019/5/22 15:16
 * @Created by jianjieming
 */
public class Main21 {
    public static void main(String[] args) throws IllegalAccessException {

        JlSupEquipmentCheckTbl obj = new JlSupEquipmentCheckTbl();
        obj.setId(1L);
        obj.setSupActualNum(2L);
        obj.setEquipmentCheckId(3L);
        obj.setEquipmentMonthPlanInfoId(4L);
        obj.setName("ss");

        System.out.println("对象中是否有为null或者为空字符串的属性: " + Main22.checkObjFieldIsNull(obj));

//        boolean flag = false;
//        for(Field f : obj.getClass().getDeclaredFields()){
//            f.setAccessible(true);
//            if(f.get(obj) == null || "".equals(f.get(obj).toString().trim())){
//                flag = true;
//            }
//        }
    }
}
