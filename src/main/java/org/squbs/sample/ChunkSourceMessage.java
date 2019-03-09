package org.squbs.sample;

import akka.NotUsed;
import akka.stream.javadsl.Source;

/**
 * Message type used for chunking response Source. Class representing message type between actor and service and should
 * be immutable.
 */
public class ChunkSourceMessage {
    public final Set<> = new ConcurrentHashSet<>();
    private static final List <FarmHandActor> = new ConcurrentHashList<>();
    private final Queue<T> = new DelayQueue<>();
    public final Publisher<PingResponse, NotUsed> pubSubstart;
    
    private ChunkSourceMessage(Source<PingResponse, InUsed> responseSource) {
        source = responseSource;
    }
    
}

