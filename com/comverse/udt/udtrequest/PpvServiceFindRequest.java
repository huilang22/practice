/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvServiceFindRequest.java
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

import com.csgsystems.ctc.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PpvServiceFindRequest Udt Request
 *
 */

public class PpvServiceFindRequest extends PpvServiceRequest {
/**
 *
 * Constructor to create a  PpvServiceFindRequest
 * @param id Unique request name
 * @param FindIn PpvServiceObjectFilter for PpvServiceFindRequest
 * @param account_internal_id Integer for PpvServiceFindRequest
 *
 */
@JsonCreator
  public PpvServiceFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PpvService")PpvServiceObjectFilter FindIn, @JsonProperty("AccountInternalId")Integer account_internal_id) {
    super(id, "PpvServiceFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PpvService", PpvServiceObjectHelper.toMap(FindIn, new HashMap(), "PpvService").get("PpvService"));
    }
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
  }

/**
 *
 * Retrieves the PpvServiceObjectDataList that results from the PpvServiceFindRequest call
 * @return PpvServiceObjectDataList resulting from udt call
 *
 */

  public PpvServiceObjectDataList getOutput() {
    return PpvServiceObjectHelper.fromMapList(outputMap, "PpvServiceList");
  }
}
