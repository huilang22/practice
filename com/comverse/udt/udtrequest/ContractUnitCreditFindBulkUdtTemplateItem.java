/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractUnitCreditFindBulkUdtTemplateItem.java
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
 * Class used to create a ContractUnitCreditFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ContractUnitCreditFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ContractUnitCreditObjectFilter findIn;
/**
 *
 * Constructor to create a  ContractUnitCreditFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContractUnitCreditFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractUnitCreditObjectFilter findInIn) {
    super(id, context, "ContractUnitCreditFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ContractUnitCredit", ContractUnitCreditObjectHelper.toMap(findIn, new HashMap(), "ContractUnitCredit").get("ContractUnitCredit"));
    }
  }


/**
 *
 * Sets the ContractUnitCredit
 * @param findInIn Value of the findIn
 *
 */

  public void setContractUnitCredit(ContractUnitCreditObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = ContractUnitCreditObjectHelper.fromMapFilter(inputMap, "ContractUnitCredit");
  }

/**
 *
 * Gets the ContractUnitCredit
 * @return Value of the ContractUnitCredit
 *
 */

  public ContractUnitCreditObjectFilter getContractUnitCredit( ) {
    return findIn;
  }

}
