/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositFindRequest.java
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
 * Class used to create a DepositFindRequest Udt Request
 *
 */

public class DepositFindRequest extends DepositRequest {
/**
 *
 * Constructor to create a  DepositFindRequest
 * @param id Unique request name
 * @param depositFindIn DepositObjectFilter for DepositFindRequest
 *
 */
@JsonCreator
  public DepositFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Deposit")DepositObjectFilter depositFindIn) {
    super(id, "DepositFind");
    if (depositFindIn != null) {
      Integer index =  depositFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Deposit", DepositObjectHelper.toMap(depositFindIn, new HashMap(), "Deposit").get("Deposit"));
    }
  }

/**
 *
 * Retrieves the DepositObjectDataList that results from the DepositFindRequest call
 * @return DepositObjectDataList resulting from udt call
 *
 */

  public DepositObjectDataList getOutput() {
    return DepositObjectHelper.fromMapList(outputMap, "DepositList");
  }
}
