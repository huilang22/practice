/*
 * Generated code DO NOT EDIT
 * Generated file: ContractTypeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ContractTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ContractTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ContractTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ContractTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ContractTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractTypeObjectDataList noOpInIn) {
    super(id, context, "ContractTypeFind");
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
        mapArray[i] = ContractTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ContractType", noOpIn);
      }
      addInput("ContractType", mapList);
    }
  }
/**
 *
 * Sets the  ContractType
 * @param noOpInIn ContractTypeObjectDataList to set
 *
 */
  public void setContractType(ContractTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ContractType passed into the constructor
 * @return Simulated response
 *
 */
  public ContractTypeObjectDataList getContractType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ContractTypeObjectHelper.fromMapList(inputMap, "ContractTypeList");
  }
}
