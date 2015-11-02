/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscReasonFindRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a DiscReasonFindRequest Udt Request
 *
 */

public class DiscReasonFindRequest extends DiscReasonRequest {
/**
 *
 * Constructor to create a  DiscReasonFindRequest
 * @param id Unique request name
 * @param DRFindIn DiscReasonObjectFilter for DiscReasonFindRequest
 *
 */
@JsonCreator
  public DiscReasonFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscReason")DiscReasonObjectFilter DRFindIn) {
    super(id, "DiscReasonFind");
    if (DRFindIn != null) {
      Integer index =  DRFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DiscReason", DiscReasonObjectHelper.toMap(DRFindIn, new HashMap(), "DiscReason").get("DiscReason"));
    }
  }

/**
 *
 * Retrieves the DiscReasonObjectDataList that results from the DiscReasonFindRequest call
 * @return DiscReasonObjectDataList resulting from udt call
 *
 */

  public DiscReasonObjectDataList getOutput() {
    return DiscReasonObjectHelper.fromMapList(outputMap, "DiscReasonList");
  }
}
