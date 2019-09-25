package 数据结构与算法.linkedlist;

/**
 * @Classname SingleLinkedListDemo
 * @Date 2019/9/25 15:26
 * @Created by jianjieming
 */
public class SingleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        // 创建一个链表
        SingleLinkedList list = new SingleLinkedList();
        // 普通加入
//        list.add(hero4);
//        list.add(hero3);
//        list.add(hero2);
//        list.add(hero1);

        // 按照编号的顺序加入
        list.addByOrder(hero4);
        list.addByOrder(hero3);
        list.addByOrder(hero2);
        list.addByOrder(hero1);
        list.addByOrder(hero3);

        list.list();
    }
}

// 定义SingleLinkedList 管理我们的英雄
class SingleLinkedList {
    // 先初始化一个头节点,头节点不要动,不存放具体数据
    private HeroNode head = new HeroNode(0, "", "");

    /**
     * 添加节点到单向链表
     * 思路: 当不考虑编号的顺序时
     * 1. 找到当前链表的最后节点
     * 2. 将最后这个节点的next指向新的节点
     *
     * @param heroNode
     */
    public void add(HeroNode heroNode) {
        // 因为head节点不能动,因此我们需要一个辅助变量 temp
        HeroNode temp = head;
        // 遍历链表,找到最后
        while (true) {
            // 找到链表的最后
            if (temp.next == null) {
                break;
            }
            // 如果没有找到最后,将temp后移
            temp = temp.next;
        }
        // 当退出这个while循环时,temp就指向了链表的最后
        temp.next = heroNode;
    }

    /**
     * 根据排名将英雄插入到指定位置
     * 如果有这个排名,则添加失败,并给出提示
     *
     * @param heroNode
     */
    public void addByOrder(HeroNode heroNode) {
        // 因为头节点不能动,因此我们仍然通过一个辅助指针(变量)来帮助我们找到添加的位置
        // 因为单链表,因此我们找的这个temp是位于添加位置的前一个节点,否则插入不了
        HeroNode temp = head;
        boolean flag = false; // 标志添加的编号是否存在,默认为false
        while (true) {
            if (temp.next == null) { // 说明temp在链表的最后
                break;
            }
            if (temp.next.no > heroNode.no) { // 位置找到,就在temp的后面插入
                break;
            } else if (temp.next.no == heroNode.no) { // 说明希望添加的heroNode的编号已然存在
                flag = true; // 说明编号存在
                break;
            }
            temp = temp.next; // 后移,相当于遍历当前的列表
        }
        if (flag) { // 不能添加,说明编号存在
            System.out.printf("准备插入的这个英雄的编号: %d,已经存在了,不能加入!\n", heroNode.no);
        } else {
            // 插入到链表中,temp的后面
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }

    /**
     * 显示链表(遍历)
     */
    public void list() {
        // 判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        // 因为头节点不能动,因此我们需要一个辅助变量来遍历
        HeroNode temp = head.next;
        while (true) {
            // 判断是否到链表最后
            if (temp == null) {
                break;
            }
            // 输出节点信息
            System.out.println(temp);
            // 将temp后移,一定小心
            temp = temp.next;
        }
    }
}

// 定义一个HeroNode, 每个HeroNode对象就是一个节点
class HeroNode {
    public int no;
    public String name;
    public String nickName;
    public HeroNode next; // 指向下一个节点

    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
