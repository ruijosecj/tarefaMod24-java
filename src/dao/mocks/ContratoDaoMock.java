package dao.mocks;

import dao.IContratoDao;

public class ContratoDaoMock implements IContratoDao {

    @Override
    public String salvar() {
        return "Salvo";
    }

    @Override
    public String buscar() {
        return "Buscando";
    }

    @Override
    public String excluir(){
        return "Excluindo";
    }

    @Override
    public String atualizar() {
        return "Atualizando";
    }
}
