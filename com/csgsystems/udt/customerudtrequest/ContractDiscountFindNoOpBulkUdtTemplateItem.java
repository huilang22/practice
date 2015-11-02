/*
 * Generated code DO NOT EDIT
 * Generated file: ContractDiscountFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ContractDiscountFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ContractDiscountFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ContractDiscountObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ContractDiscountFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ContractDiscountFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractDiscountObjectDataList noOpInIn) {
    super(id, context, "ContractDiscountFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = ContractDiscountObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ContractDiscount", noOpIn);
      }
      addInput("ContractDiscount", mapList);
    }
  }
/**
 *
 * Sets the  ContractDiscount
 * @param noOpInIn ContractDiscountObjectDataList to set
 *
 */
  public void setContractDiscount(ContractDiscountObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ContractDiscount passed into the constructor
 * @return Simulated response
 *
 */
  public ContractDiscountObjectDataList getContractDiscount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ContractDiscountObjectHelper.fromMapList(inputMap, "ContractDiscountList");
  }
}
