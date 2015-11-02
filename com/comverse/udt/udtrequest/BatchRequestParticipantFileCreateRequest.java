/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestParticipantFileCreateRequest.java
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
 * Class used to create a BatchRequestParticipantFileCreateRequest Udt Request
 *
 */

public class BatchRequestParticipantFileCreateRequest extends BatchRequestParticipantRequest {
/**
 *
 * Constructor to create a  BatchRequestParticipantFileCreateRequest
 * @param id Unique request name
 * @param BatchRequestParticipantFileCreateIn BatchRequestParticipantObjectFilter for BatchRequestParticipantFileCreateRequest
 * @param xml_file_name String for BatchRequestParticipantFileCreateRequest
 *
 */
@JsonCreator
  public BatchRequestParticipantFileCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchRequestParticipant")BatchRequestParticipantObjectFilter BatchRequestParticipantFileCreateIn, @JsonProperty("XmlFileName")String xml_file_name) {
    super(id, "BatchRequestParticipantFileCreate");
    if (BatchRequestParticipantFileCreateIn != null) {
      Integer index =  BatchRequestParticipantFileCreateIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectHelper.toMap(BatchRequestParticipantFileCreateIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
    if (xml_file_name != null) {
      addInput("XmlFileName", xml_file_name);
    }
  }

/**
 *
 * Retrieves the Integer that results from the BatchRequestParticipantFileCreateRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
