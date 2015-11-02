/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractFindWithExtendedDataNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a CustomerContractFindWithExtendedDataNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerContractFindWithExtendedDataNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerContractObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CustomerContractFindWithExtendedDataNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerContractFindWithExtendedDataNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectDataList noOpInIn) {
    super(id, context, "CustomerContractFindWithExtendedData");
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
        mapArray[i] = CustomerContractObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CustomerContract", noOpIn);
      }
      addInput("CustomerContract", mapList);
    }
  }
/**
 *
 * Sets the  CustomerContract
 * @param noOpInIn CustomerContractObjectDataList to set
 *
 */
  public void setCustomerContract(CustomerContractObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CustomerContract passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerContractObjectDataList getCustomerContract() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CustomerContractObjectHelper.fromMapList(inputMap, "CustomerContractList");
  }
}
