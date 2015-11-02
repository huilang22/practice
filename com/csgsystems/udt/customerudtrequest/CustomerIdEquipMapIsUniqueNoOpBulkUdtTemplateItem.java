/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerIdEquipMapIsUniqueNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a CustomerIdEquipMapIsUniqueNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerIdEquipMapIsUniqueNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected Integer noOpIn;

/**
 *
 * Constructor to create a   CustomerIdEquipMapIsUniqueNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerIdEquipMapIsUniqueNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer noOpInIn) {
    super(id, context, "CustomerIdEquipMapIsUnique");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("IsUnique", noOpIn);
    }
  }
/**
 *
 * Sets the  IsUnique
 * @param noOpInIn Integer to set
 *
 */
  public void setIsUnique(Integer noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the IsUnique passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getIsUnique() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (Integer)inputMap.get("IsUnique");
  }
}
