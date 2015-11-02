/*
 * Generated code DO NOT EDIT
 * Generated file: ContractTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a ContractTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ContractTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ContractTypeObjectKeyData CTGetIn;
/**
 *
 * Constructor to create a  ContractTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContractTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractTypeObjectKeyData CTGetInIn) {
    super(id, context, "ContractTypeGet");
    CTGetIn = CTGetInIn;
  }

  public void translateToMap() {
    if (CTGetIn != null) {
      CTGetIn.resetFlags(true, true);
      addInput("ContractType", ContractTypeObjectKeyHelper.toMap(CTGetIn, new HashMap(), "ContractTypeObjectKeyData").get("ContractTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the ContractType
 * @param CTGetInIn Value of the CTGetIn
 *
 */

  public void setContractType(ContractTypeObjectKeyData CTGetInIn) {
    CTGetIn = CTGetInIn;
  }

  public void translateFromMap() {
    CTGetIn = ContractTypeObjectKeyHelper.fromMap(inputMap, "ContractType");
  }

/**
 *
 * Gets the ContractType
 * @return Value of the ContractType
 *
 */

  public ContractTypeObjectKeyData getContractType( ) {
    return CTGetIn;
  }

}
