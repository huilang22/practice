/*
 * Generated code DO NOT EDIT
 * Generated file: DepositTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a DepositTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class DepositTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DepositTypeObjectFilter DTFindIn;
/**
 *
 * Constructor to create a  DepositTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DepositTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, DepositTypeObjectFilter DTFindInIn) {
    super(id, context, "DepositTypeFind");
    DTFindIn = DTFindInIn;
  }

  public void translateToMap() {
    if (DTFindIn != null) {
      Integer index =  DTFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DepositType", DepositTypeObjectHelper.toMap(DTFindIn, new HashMap(), "DepositType").get("DepositType"));
    }
  }


/**
 *
 * Sets the DepositType
 * @param DTFindInIn Value of the DTFindIn
 *
 */

  public void setDepositType(DepositTypeObjectFilter DTFindInIn) {
    DTFindIn = DTFindInIn;
  }

  public void translateFromMap() {
    DTFindIn = DepositTypeObjectHelper.fromMapFilter(inputMap, "DepositType");
  }

/**
 *
 * Gets the DepositType
 * @return Value of the DepositType
 *
 */

  public DepositTypeObjectFilter getDepositType( ) {
    return DTFindIn;
  }

}
