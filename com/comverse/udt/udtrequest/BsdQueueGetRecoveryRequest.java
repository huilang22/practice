/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdQueueGetRecoveryRequest.java
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

import com.csgsystems.sfq.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BsdQueueGetRecoveryRequest Udt Request
 *
 */

public class BsdQueueGetRecoveryRequest extends BsdQueueRequest {
/**
 *
 * Constructor to create a  BsdQueueGetRecoveryRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdQueueGetRecoveryRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdQueueGetRecovery");
  }

/**
 *
 * Retrieves the BsdQueueObjectDataList that results from the BsdQueueGetRecoveryRequest call
 * @return BsdQueueObjectDataList resulting from udt call
 *
 */

  public BsdQueueObjectDataList getOutput() {
    return BsdQueueObjectHelper.fromMapList(outputMap, "BsdQueueList");
  }
}
