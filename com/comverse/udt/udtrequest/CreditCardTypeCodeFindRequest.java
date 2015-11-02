/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CreditCardTypeCodeFindRequest.java
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
 * Class used to create a CreditCardTypeCodeFindRequest Udt Request
 *
 */

public class CreditCardTypeCodeFindRequest extends CreditCardTypeCodeRequest {
/**
 *
 * Constructor to create a  CreditCardTypeCodeFindRequest
 * @param id Unique request name
 * @param CreditCardTypeCodefindIn CreditCardTypeCodeObjectFilter for CreditCardTypeCodeFindRequest
 *
 */
@JsonCreator
  public CreditCardTypeCodeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CreditCardTypeCode")CreditCardTypeCodeObjectFilter CreditCardTypeCodefindIn) {
    super(id, "CreditCardTypeCodeFind");
    if (CreditCardTypeCodefindIn != null) {
      Integer index =  CreditCardTypeCodefindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CreditCardTypeCode", CreditCardTypeCodeObjectHelper.toMap(CreditCardTypeCodefindIn, new HashMap(), "CreditCardTypeCode").get("CreditCardTypeCode"));
    }
  }

/**
 *
 * Retrieves the CreditCardTypeCodeObjectDataList that results from the CreditCardTypeCodeFindRequest call
 * @return CreditCardTypeCodeObjectDataList resulting from udt call
 *
 */

  public CreditCardTypeCodeObjectDataList getOutput() {
    return CreditCardTypeCodeObjectHelper.fromMapList(outputMap, "CreditCardTypeCodeList");
  }
}
