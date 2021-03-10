/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArvoreDeBuscaShowTrabalho;

public class NoArvShow {

    private ItemShow info; // o tipo Item está declarado no capítulo 1
    private NoArvShow esq, dir;

    public NoArvShow(ItemShow elem) {
        this.info = elem;
        this.esq = null;
        this.dir = null;
    }

    public NoArvShow getEsq() {
        return this.esq;
    }

    public NoArvShow getDir() {
        return this.dir;
    }

    public ItemShow getInfo() {
        return this.info;
    }

    public void setEsq(NoArvShow no) {
        this.esq = no;
    }

    public void setDir(NoArvShow no) {
        this.dir = no;
    }

    public void setInfo(ItemShow elem) {
        this.info = elem;
    }
}
