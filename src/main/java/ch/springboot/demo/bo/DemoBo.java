package ch.springboot.demo.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;

/**
 *  swagger 实体注解的一个demo
 */
@ApiModel("swagger Bo注解demo")
public class DemoBo {

    @NotNull
    @ApiModelProperty(value = "编号")
    private long id;

    @Max(150)
    @Min(1)
    private int no;

    @Size(max = 20)
    private String name;

    @Pattern(regexp = "xxxxx....")
    private String eamil;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }
}
