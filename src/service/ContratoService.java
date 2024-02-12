package service;

import dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        String retorno = contratoDao.buscar();
        return retorno;
    }

    public String atualizar() {
        String retorno = contratoDao.atualizar();
        return retorno;
    }

    public String excluir() {
        String retorno = contratoDao.excluir();
        return retorno;
    }
}
