/*
 * Generated code DO NOT EDIT
 * Generated file: ContractUnitCreditFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ContractUnitCreditFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ContractUnitCreditFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ContractUnitCreditObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ContractUnitCreditFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ContractUnitCreditFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractUnitCreditObjectDataList noOpInIn) {
    super(id, context, "ContractUnitCreditFind");
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
        mapArray[i] = ContractUnitCreditObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ContractUnitCredit", noOpIn);
      }
      addInput("ContractUnitCredit", mapList);
    }
  }
/**
 *
 * Sets the  ContractUnitCredit
 * @param noOpInIn ContractUnitCreditObjectDataList to set
 *
 */
  public void setContractUnitCredit(ContractUnitCreditObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ContractUnitCredit passed into the constructor
 * @return Simulated response
 *
 */
  public ContractUnitCreditObjectDataList getContractUnitCredit() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ContractUnitCreditObjectHelper.fromMapList(inputMap, "ContractUnitCreditList");
  }
}
