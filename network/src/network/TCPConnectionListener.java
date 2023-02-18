package network;

public interface TCPConnectionListener {
    /**
     * Запускает соединение
     * @param tcpConnection
     */
    void onConnectionReady(TCPConnection tcpConnection);

    /**
     * Соединение приняло входящую строку
     * @param tcpConnection
     * @param value
     */
    void onReceiveString(TCPConnection tcpConnection, String value);

    /**
     * Соединение разорвалось
     * @param tcpConnection
     */
    void onDisconnect(TCPConnection tcpConnection);

    /**
     * Если произошло исключение
     * @param tcpConnection
     * @param e
     */
    void onException(TCPConnection tcpConnection, Exception e);
}
