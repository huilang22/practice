/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a ContractTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ContractTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ContractTypeObjectFilter CTFndIn;
/**
 *
 * Constructor to create a  ContractTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContractTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractTypeObjectFilter CTFndInIn) {
    super(id, context, "ContractTypeFind");
    CTFndIn = CTFndInIn;
  }

  public void translateToMap() {
    if (CTFndIn != null) {
      Integer index =  CTFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ContractType", ContractTypeObjectHelper.toMap(CTFndIn, new HashMap(), "ContractType").get("ContractType"));
    }
  }


/**
 *
 * Sets the ContractType
 * @param CTFndInIn Value of the CTFndIn
 *
 */

  public void setContractType(ContractTypeObjectFilter CTFndInIn) {
    CTFndIn = CTFndInIn;
  }

  public void translateFromMap() {
    CTFndIn = ContractTypeObjectHelper.fromMapFilter(inputMap, "ContractType");
  }

/**
 *
 * Gets the ContractType
 * @return Value of the ContractType
 *
 */

  public ContractTypeObjectFilter getContractType( ) {
    return CTFndIn;
  }

}
