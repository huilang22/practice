/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantDefinitionSequenceGetRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.bat.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BatchRequestParticipantDefinitionSequenceGetRequest Udt Request
 *
 */

public class BatchRequestParticipantDefinitionSequenceGetRequest extends BatchRequestParticipantDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BatchRequestParticipantDefinitionSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BatchRequestParticipantDefinitionSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BatchRequestParticipantDefinitionSequenceGet");
  }

/**
 *
 * Retrieves the BatchRequestParticipantDefinitionObjectKeyData that results from the BatchRequestParticipantDefinitionSequenceGetRequest call
 * @return BatchRequestParticipantDefinitionObjectKeyData resulting from udt call
 *
 */

  public BatchRequestParticipantDefinitionObjectKeyData getOutput() {
    return BatchRequestParticipantDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestParticipantDefinition");
  }
}
