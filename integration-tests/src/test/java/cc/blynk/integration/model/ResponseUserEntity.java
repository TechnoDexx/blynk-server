package cc.blynk.integration.model;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 24.12.15.
 */
public class ResponseUserEntity {

    public String pass;

    public ResponseUserEntity(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "{\"pass\":\""+ pass +"\"}";
    }

}
