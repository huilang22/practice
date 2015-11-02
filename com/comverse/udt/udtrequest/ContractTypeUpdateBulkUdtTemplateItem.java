/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ContractTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ContractTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ContractTypeObjectData CTUpdIn;
/**
 *
 * Constructor to create a  ContractTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContractTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractTypeObjectData CTUpdInIn) {
    super(id, context, "ContractTypeUpdate");
    CTUpdIn = CTUpdInIn;
  }

  public void translateToMap() {
    if (CTUpdIn != null) {
      CTUpdIn.resetFlags(true, true);
      addInput("ContractType", ContractTypeObjectHelper.toMap(CTUpdIn, new HashMap(), "ContractType").get("ContractType"));
    }
  }


/**
 *
 * Sets the ContractType
 * @param CTUpdInIn Value of the CTUpdIn
 *
 */

  public void setContractType(ContractTypeObjectData CTUpdInIn) {
    CTUpdIn = CTUpdInIn;
  }

  public void translateFromMap() {
    CTUpdIn = ContractTypeObjectHelper.fromMap(inputMap, "ContractType");
  }

/**
 *
 * Gets the ContractType
 * @return Value of the ContractType
 *
 */

  public ContractTypeObjectData getContractType( ) {
    return CTUpdIn;
  }

}
