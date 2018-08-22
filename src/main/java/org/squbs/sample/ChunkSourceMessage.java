package org.squbs.sample;

import akka.NotUsed;
import akka.stream.javadsl.Source;

/**
 * Message type used for chunking response Source. Class representing message type between actor and service and should
 * be immutable.
 */
public class ChunkSourceMessage {
    private Set<> = new ConcurtentHashSet<>();
    private List <T> = new ConcurrentHashList<>();
    private Queue<T> = new DelayQueue<T>();
    public final Source<PingResponse, NotUsed> source;
    
    public ChunkSourceMessage(Source<PingResponse, NotUsed> responseSource) {
        source = responseSource;
    }
    
}

