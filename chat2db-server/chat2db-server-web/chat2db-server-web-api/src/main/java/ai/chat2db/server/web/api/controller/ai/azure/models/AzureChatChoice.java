// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package ai.chat2db.server.web.api.controller.ai.azure.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * The representation of a single prompt completion as part of an overall chat completions request. Generally, `n`
 * choices are generated per provided prompt with a default value of 1. Token limits and other settings may limit the
 * number of choices generated.
 */
@Data
public final class AzureChatChoice {

    /*
     * The chat message for a given chat completions prompt.
     */
    @JsonProperty(value = "message")
    private AzureChatMessage message;

    /*
     * The ordered index associated with this chat completions choice.
     */
    @JsonProperty(value = "index")
    private int index;

    /*
     * The reason that this chat completions choice completed its generated.
     */
    @JsonProperty(value = "finish_reason")
    private AzureCompletionsFinishReason finishReason;

    /*
     * The delta message content for a streaming response.
     */
    @JsonProperty(value = "delta")
    private AzureChatMessage delta;

    /**
     * Creates an instance of ChatChoice class.
     *
     * @param index the index value to set.
     * @param finishReason the finishReason value to set.
     */
    @JsonCreator
    private AzureChatChoice(
            @JsonProperty(value = "index") int index,
            @JsonProperty(value = "finish_reason") AzureCompletionsFinishReason finishReason) {
        this.index = index;
        this.finishReason = finishReason;
    }

    /**
     * Get the message property: The chat message for a given chat completions prompt.
     *
     * @return the message value.
     */
    public AzureChatMessage getMessage() {
        return this.message;
    }

    /**
     * Get the index property: The ordered index associated with this chat completions choice.
     *
     * @return the index value.
     */
    public int getIndex() {
        return this.index;
    }

    /**
     * Get the finishReason property: The reason that this chat completions choice completed its generated.
     *
     * @return the finishReason value.
     */
    public AzureCompletionsFinishReason getFinishReason() {
        return this.finishReason;
    }

    /**
     * Get the delta property: The delta message content for a streaming response.
     *
     * @return the delta value.
     */
    public AzureChatMessage getDelta() {
        return this.delta;
    }
}
