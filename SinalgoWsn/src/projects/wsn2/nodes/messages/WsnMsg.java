/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.wsn2.nodes.messages;

import sinalgo.nodes.Node;
import sinalgo.nodes.messages.Message;

/**
 *
 * @author pozza
 */
public class WsnMsg extends Message {
    
//Identificador da mensagem
    public Integer sequenceID;
//Tempo de vida do Pacote
    public Integer ttl;
//Nó de destino
    public Node destino;
//Nó de origem
    public Node origem;
//No que vai reencaminhar a mensagem
    public Node forwardingHop;
//Número de saltos até o destino
    public Integer saltosAteDestino;
//Tipo do Pacote. 0 para Estabelecimento de Rotas e 1 para pacotes de dados
    public Integer tipoMsg = 0;
//Construtor da Classe
    

    public WsnMsg(Integer seqID, Node origem, Node destino, Node forwardingHop, Integer tipo) {
        this.sequenceID = seqID;
        this.origem = origem;
        this.destino = destino;
        this.forwardingHop = forwardingHop;
        this.tipoMsg = tipo;
       
    }

    @Override
    public Message clone() {
        WsnMsg msg = new WsnMsg(this.sequenceID, this.origem,this.destino, this.forwardingHop, this.tipoMsg);
        msg.ttl = this.ttl;
        msg.saltosAteDestino = saltosAteDestino;  
       
        return msg;
    }
}
