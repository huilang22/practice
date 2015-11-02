/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseContactsFindCountRequest.java
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
 * Class used to create a ClearingHouseContactsFindCountRequest Udt Request
 *
 */

public class ClearingHouseContactsFindCountRequest extends ClearingHouseContactsRequest {
/**
 *
 * Constructor to create a  ClearingHouseContactsFindCountRequest
 * @param id Unique request name
 * @param CHCFindCountIn ClearingHouseContactsObjectFilter for ClearingHouseContactsFindCountRequest
 *
 */
@JsonCreator
  public ClearingHouseContactsFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("ClearingHouseContacts")ClearingHouseContactsObjectFilter CHCFindCountIn) {
    super(id, "ClearingHouseContactsFindCount");
    if (CHCFindCountIn != null) {
      Integer index =  CHCFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ClearingHouseContacts", ClearingHouseContactsObjectHelper.toMap(CHCFindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the ClearingHouseContactsFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
