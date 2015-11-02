/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractDiscountGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ContractDiscountGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ContractDiscountGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ContractDiscountObjectKeyData CDGetIn;
/**
 *
 * Constructor to create a  ContractDiscountGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContractDiscountGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractDiscountObjectKeyData CDGetInIn) {
    super(id, context, "ContractDiscountGet");
    CDGetIn = CDGetInIn;
  }

  public void translateToMap() {
    if (CDGetIn != null) {
      CDGetIn.resetFlags(true, true);
      addInput("ContractDiscount", ContractDiscountObjectKeyHelper.toMap(CDGetIn, new HashMap(), "ContractDiscountObjectKeyData").get("ContractDiscountObjectKeyData"));
    }
  }


/**
 *
 * Sets the ContractDiscount
 * @param CDGetInIn Value of the CDGetIn
 *
 */

  public void setContractDiscount(ContractDiscountObjectKeyData CDGetInIn) {
    CDGetIn = CDGetInIn;
  }

  public void translateFromMap() {
    CDGetIn = ContractDiscountObjectKeyHelper.fromMap(inputMap, "ContractDiscount");
  }

/**
 *
 * Gets the ContractDiscount
 * @return Value of the ContractDiscount
 *
 */

  public ContractDiscountObjectKeyData getContractDiscount( ) {
    return CDGetIn;
  }

}
