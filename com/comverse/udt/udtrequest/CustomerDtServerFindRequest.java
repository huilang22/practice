/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDtServerFindRequest.java
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
 * Class used to create a CustomerDtServerFindRequest Udt Request
 *
 */

public class CustomerDtServerFindRequest extends CustomerDtServerRequest {
/**
 *
 * Constructor to create a  CustomerDtServerFindRequest
 * @param id Unique request name
 * @param CusDocServerFindIn CustomerDtServerObjectFilter for CustomerDtServerFindRequest
 *
 */
@JsonCreator
  public CustomerDtServerFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerDtServer")CustomerDtServerObjectFilter CusDocServerFindIn) {
    super(id, "CustomerDtServerFind");
    if (CusDocServerFindIn != null) {
      Integer index =  CusDocServerFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerDtServer", CustomerDtServerObjectHelper.toMap(CusDocServerFindIn, new HashMap(), "CustomerDtServer").get("CustomerDtServer"));
    }
  }

/**
 *
 * Retrieves the CustomerDtServerObjectDataList that results from the CustomerDtServerFindRequest call
 * @return CustomerDtServerObjectDataList resulting from udt call
 *
 */

  public CustomerDtServerObjectDataList getOutput() {
    return CustomerDtServerObjectHelper.fromMapList(outputMap, "CustomerDtServerList");
  }
}
