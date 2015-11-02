/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftTransactionFindRequest.java
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
 * Class used to create a EftTransactionFindRequest Udt Request
 *
 */

public class EftTransactionFindRequest extends EftTransactionRequest {
/**
 *
 * Constructor to create a  EftTransactionFindRequest
 * @param id Unique request name
 * @param eftFindIn EftTransactionObjectFilter for EftTransactionFindRequest
 *
 */
@JsonCreator
  public EftTransactionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("EftTransaction")EftTransactionObjectFilter eftFindIn) {
    super(id, "EftTransactionFind");
    if (eftFindIn != null) {
      Integer index =  eftFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EftTransaction", EftTransactionObjectHelper.toMap(eftFindIn, new HashMap(), "EftTransaction").get("EftTransaction"));
    }
  }

/**
 *
 * Retrieves the EftTransactionObjectDataList that results from the EftTransactionFindRequest call
 * @return EftTransactionObjectDataList resulting from udt call
 *
 */

  public EftTransactionObjectDataList getOutput() {
    return EftTransactionObjectHelper.fromMapList(outputMap, "EftTransactionList");
  }
}
