package Parser.xml;

public class Plant {

    private  long id;
    private String name;
    private  long code;
    private String hibrid_name;
    private String patent_number;
    private String start_date;
    private String patent_owner;
    private String end_date;
    private long str_register_date;

    public Plant() {
    }

    public Plant(long id, String name, Long code, String hibrid_name, String patent_number, String start_date, String patent_owner, String end_date, long str_register_date) {
        this.id = 0;
        this.name = "";
        this.code = 0;
        this.hibrid_name ="";
        this.patent_number = "";
        this.start_date = "";
        this.patent_owner = "";
        this.end_date = "";
        this.str_register_date = 0;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code=" + code +
                ", hibrid_name='" + hibrid_name + '\'' +
                ", patent_number='" + patent_number + '\'' +
                ", start_date='" + start_date + '\'' +
                ", patent_owner='" + patent_owner + '\'' +
                ", end_date='" + end_date + '\'' +
                ", str_register_date=" + str_register_date +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getHibrid_name() {
        return hibrid_name;
    }

    public void setHibrid_name(String hibrid_name) {
        this.hibrid_name = hibrid_name;
    }

    public String getPatent_number() {
        return patent_number;
    }

    public void setPatent_number(String patent_number) {
        this.patent_number = patent_number;
    }


    public String getPatent_owner() {
        return patent_owner;
    }

    public void setPatent_owner(String patent_owner) {
        this.patent_owner = patent_owner;
    }



    public long getStr_register_date() {
        return str_register_date;
    }

    public void setStr_register_date(long str_register_date) {
        this.str_register_date = str_register_date;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
}
