package org.jetlinks.rule.engine.executor.node.notify;

import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

public interface EmailSender {

    Mono<Boolean> sendTemplate(String templateId, Map<String, Object> context, List<String> sendTo);

    Mono<Boolean> send(String subject, String text, Map<String, Object> context, List<String> sendTo);

}
