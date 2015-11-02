/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeValidateCreateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ContractTypeValidateCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ContractTypeValidateCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ContractTypeObjectData ContractTypeIn;
  protected Integer ServiceInternalId;
  protected Integer ServiceInternalIdResets;
/**
 *
 * Constructor to create a  ContractTypeValidateCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContractTypeValidateCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ContractTypeObjectData ContractTypeInIn, Integer ServiceInternalIdIn, Integer ServiceInternalIdResetsIn) {
    super(id, context, "ContractTypeValidateCreate");
    ContractTypeIn = ContractTypeInIn;
    ServiceInternalId = ServiceInternalIdIn;
    ServiceInternalIdResets = ServiceInternalIdResetsIn;
  }

  public void translateToMap() {
    if (ContractTypeIn != null) {
      ContractTypeIn.resetFlags(true, true);
      addInput("ContractTypeValidate", ContractTypeObjectHelper.toMap(ContractTypeIn, new HashMap(), "ContractTypeValidate").get("ContractTypeValidate"));
    }
    if (ServiceInternalId != null) {
      addInput("ServiceInternalId", ServiceInternalId);
    }
    if (ServiceInternalIdResets != null) {
      addInput("ServiceInternalIdResets", ServiceInternalIdResets);
    }
  }


/**
 *
 * Sets the ContractTypeValidate
 * @param ContractTypeInIn Value of the ContractTypeIn
 *
 */

  public void setContractTypeValidate(ContractTypeObjectData ContractTypeInIn) {
    ContractTypeIn = ContractTypeInIn;
  }

/**
 *
 * Sets the ServiceInternalId
 * @param ServiceInternalIdIn Value of the ServiceInternalId
 *
 */

  public void setServiceInternalId(Integer ServiceInternalIdIn) {
    ServiceInternalId = ServiceInternalIdIn;
  }

/**
 *
 * Sets the ServiceInternalIdResets
 * @param ServiceInternalIdResetsIn Value of the ServiceInternalIdResets
 *
 */

  public void setServiceInternalIdResets(Integer ServiceInternalIdResetsIn) {
    ServiceInternalIdResets = ServiceInternalIdResetsIn;
  }

  public void translateFromMap() {
    ContractTypeIn = ContractTypeObjectHelper.fromMap(inputMap, "ContractTypeValidate");
    ServiceInternalId = (Integer)inputMap.get("ServiceInternalId");
    ServiceInternalIdResets = (Integer)inputMap.get("ServiceInternalIdResets");
  }

/**
 *
 * Gets the ContractTypeValidate
 * @return Value of the ContractTypeValidate
 *
 */

  public ContractTypeObjectData getContractTypeValidate( ) {
    return ContractTypeIn;
  }

/**
 *
 * Gets the ServiceInternalId
 * @return Value of the ServiceInternalId
 *
 */

  public Integer getServiceInternalId( ) {
    return ServiceInternalId;
  }

/**
 *
 * Gets the ServiceInternalIdResets
 * @return Value of the ServiceInternalIdResets
 *
 */

  public Integer getServiceInternalIdResets( ) {
    return ServiceInternalIdResets;
  }

}
