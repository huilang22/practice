/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CreditCardFindRequest.java
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
 * Class used to create a CreditCardFindRequest Udt Request
 *
 */

public class CreditCardFindRequest extends CreditCardRequest {
/**
 *
 * Constructor to create a  CreditCardFindRequest
 * @param id Unique request name
 * @param findIn CreditCardObjectFilter for CreditCardFindRequest
 *
 */
@JsonCreator
  public CreditCardFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CreditCard")CreditCardObjectFilter findIn) {
    super(id, "CreditCardFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CreditCard", CreditCardObjectHelper.toMap(findIn, new HashMap(), "CreditCard").get("CreditCard"));
    }
  }

/**
 *
 * Retrieves the CreditCardObjectDataList that results from the CreditCardFindRequest call
 * @return CreditCardObjectDataList resulting from udt call
 *
 */

  public CreditCardObjectDataList getOutput() {
    return CreditCardObjectHelper.fromMapList(outputMap, "CreditCardList");
  }
}
