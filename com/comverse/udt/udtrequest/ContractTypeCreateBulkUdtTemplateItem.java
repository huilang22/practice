/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a ContractTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ContractTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ContractTypeObjectData CTCrIn;
/**
 *
 * Constructor to create a  ContractTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContractTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractTypeObjectData CTCrInIn) {
    super(id, context, "ContractTypeCreate");
    CTCrIn = CTCrInIn;
  }

  public void translateToMap() {
    if (CTCrIn != null) {
      CTCrIn.resetFlags(true, true);
      addInput("ContractType", ContractTypeObjectHelper.toMap(CTCrIn, new HashMap(), "ContractType").get("ContractType"));
    }
  }


/**
 *
 * Sets the ContractType
 * @param CTCrInIn Value of the CTCrIn
 *
 */

  public void setContractType(ContractTypeObjectData CTCrInIn) {
    CTCrIn = CTCrInIn;
  }

  public void translateFromMap() {
    CTCrIn = ContractTypeObjectHelper.fromMap(inputMap, "ContractType");
  }

/**
 *
 * Gets the ContractType
 * @return Value of the ContractType
 *
 */

  public ContractTypeObjectData getContractType( ) {
    return CTCrIn;
  }

}
