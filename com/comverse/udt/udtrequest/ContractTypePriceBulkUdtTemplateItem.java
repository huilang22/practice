/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypePriceBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a ContractTypePriceBulkUdtTemplateItem Bulk Template
 *
 */

public class ContractTypePriceBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ContractTypeObjectKeyData ctpContractTypeIn;
  protected RatingKeyObjectData ctpRatingKeyIn;
/**
 *
 * Constructor to create a  ContractTypePriceBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContractTypePriceBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractTypeObjectKeyData ctpContractTypeInIn, RatingKeyObjectData ctpRatingKeyInIn) {
    super(id, context, "ContractTypePrice");
    ctpContractTypeIn = ctpContractTypeInIn;
    ctpRatingKeyIn = ctpRatingKeyInIn;
  }

  public void translateToMap() {
    if (ctpContractTypeIn != null) {
      ctpContractTypeIn.resetFlags(true, true);
      addInput("ContractType", ContractTypeObjectKeyHelper.toMap(ctpContractTypeIn, new HashMap(), "ContractTypeObjectKeyData").get("ContractTypeObjectKeyData"));
    }
    if (ctpRatingKeyIn != null) {
      ctpRatingKeyIn.resetFlags(true, true);
      addInput("RatingKey", RatingKeyObjectHelper.toMap(ctpRatingKeyIn, new HashMap(), "CtPrice").get("CtPrice"));
    }
  }


/**
 *
 * Sets the ContractType
 * @param ctpContractTypeInIn Value of the ctpContractTypeIn
 *
 */

  public void setContractType(ContractTypeObjectKeyData ctpContractTypeInIn) {
    ctpContractTypeIn = ctpContractTypeInIn;
  }

/**
 *
 * Sets the RatingKey
 * @param ctpRatingKeyInIn Value of the ctpRatingKeyIn
 *
 */

  public void setRatingKey(RatingKeyObjectData ctpRatingKeyInIn) {
    ctpRatingKeyIn = ctpRatingKeyInIn;
  }

  public void translateFromMap() {
    ctpContractTypeIn = ContractTypeObjectKeyHelper.fromMap(inputMap, "ContractType");
    ctpRatingKeyIn = RatingKeyObjectHelper.fromMap(inputMap, "RatingKey");
  }

/**
 *
 * Gets the ContractType
 * @return Value of the ContractType
 *
 */

  public ContractTypeObjectKeyData getContractType( ) {
    return ctpContractTypeIn;
  }

/**
 *
 * Gets the RatingKey
 * @return Value of the RatingKey
 *
 */

  public RatingKeyObjectData getRatingKey( ) {
    return ctpRatingKeyIn;
  }

}
