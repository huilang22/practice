/*
 * Generated code DO NOT EDIT
 * Generated file: ContractDiscountFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a ContractDiscountFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ContractDiscountFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ContractDiscountObjectFilter CDFindIn;
/**
 *
 * Constructor to create a  ContractDiscountFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContractDiscountFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractDiscountObjectFilter CDFindInIn) {
    super(id, context, "ContractDiscountFind");
    CDFindIn = CDFindInIn;
  }

  public void translateToMap() {
    if (CDFindIn != null) {
      Integer index =  CDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ContractDiscount", ContractDiscountObjectHelper.toMap(CDFindIn, new HashMap(), "ContractDiscount").get("ContractDiscount"));
    }
  }


/**
 *
 * Sets the ContractDiscount
 * @param CDFindInIn Value of the CDFindIn
 *
 */

  public void setContractDiscount(ContractDiscountObjectFilter CDFindInIn) {
    CDFindIn = CDFindInIn;
  }

  public void translateFromMap() {
    CDFindIn = ContractDiscountObjectHelper.fromMapFilter(inputMap, "ContractDiscount");
  }

/**
 *
 * Gets the ContractDiscount
 * @return Value of the ContractDiscount
 *
 */

  public ContractDiscountObjectFilter getContractDiscount( ) {
    return CDFindIn;
  }

}
