package br.com.soc.sistema.vo;

import java.util.Date;

public class ExamesRealizadosVo {

    FuncionarioVo funcionarioVo;
    ExameVo exameVo;
    Date dataExame;

    public FuncionarioVo getFuncionarioVo() {
        return funcionarioVo;
    }

    public void setFuncionarioVo(FuncionarioVo funcionarioVo) {
        this.funcionarioVo = funcionarioVo;
    }

    public ExameVo getExameVo() {
        return exameVo;
    }

    public void setExameVo(ExameVo exameVo) {
        this.exameVo = exameVo;
    }

    public Date getDataExame() {
        return dataExame;
    }

    public void setDataExame(Date dataExame) {
        this.dataExame = dataExame;

    }
}
