/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalRcFindRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ExternalRcFindRequest Udt Request
 *
 */

public class ExternalRcFindRequest extends ExternalRcRequest {
/**
 *
 * Constructor to create a  ExternalRcFindRequest
 * @param id Unique request name
 * @param ExternalRcFindIn ExternalRcObjectFilter for ExternalRcFindRequest
 *
 */
@JsonCreator
  public ExternalRcFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExternalRc")ExternalRcObjectFilter ExternalRcFindIn) {
    super(id, "ExternalRcFind");
    if (ExternalRcFindIn != null) {
      Integer index =  ExternalRcFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExternalRc", ExternalRcObjectHelper.toMap(ExternalRcFindIn, new HashMap(), "ExternalRc").get("ExternalRc"));
    }
  }

/**
 *
 * Retrieves the ExternalRcObjectDataList that results from the ExternalRcFindRequest call
 * @return ExternalRcObjectDataList resulting from udt call
 *
 */

  public ExternalRcObjectDataList getOutput() {
    return ExternalRcObjectHelper.fromMapList(outputMap, "ExternalRcList");
  }
}
