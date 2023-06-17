package multi.backend.project.review.paging;


import lombok.Data;
// 페이지 번호와 한 페이지당 몇 개의 데이터를 보여줄 것인지를 외부 클래스로 별도 관리
@Data
public class Criteria {
    private int pageNum; // 페이지 번호
    private int amount; // 한 페이지당 보여질 데이터의 개수

    public Criteria(){
        this(1,10);

    }
    public Criteria(int pageNum, int amount){
        this.pageNum=pageNum;
        this.amount = amount;
    }
}
