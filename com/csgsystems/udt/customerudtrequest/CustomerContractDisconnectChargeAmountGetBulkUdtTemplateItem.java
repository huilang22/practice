/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerContractDisconnectChargeAmountGetBulkUdtTemplateItem.java
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
 * Class used to create a CustomerContractDisconnectChargeAmountGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerContractDisconnectChargeAmountGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer contract_tracking_id;
  protected Integer contract_tracking_id_serv;
  protected Date _disconnect_date;
/**
 *
 * Constructor to create a  CustomerContractDisconnectChargeAmountGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerContractDisconnectChargeAmountGetBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer contract_tracking_idIn, Integer contract_tracking_id_servIn, Date _disconnect_dateIn) {
    super(id, context, "CustomerContractDisconnectChargeAmountGet");
    contract_tracking_id = contract_tracking_idIn;
    contract_tracking_id_serv = contract_tracking_id_servIn;
    _disconnect_date = _disconnect_dateIn;
  }

  public void translateToMap() {
    if (contract_tracking_id != null) {
      addInput("ContractTrackingId", contract_tracking_id);
    }
    if (contract_tracking_id_serv != null) {
      addInput("ContractTrackingIdServ", contract_tracking_id_serv);
    }
    if (_disconnect_date != null) {
      addInput("DisconnectDate", _disconnect_date);
    }
  }


/**
 *
 * Sets the ContractTrackingId
 * @param contract_tracking_idIn Value of the contract_tracking_id
 *
 */

  public void setContractTrackingId(Integer contract_tracking_idIn) {
    contract_tracking_id = contract_tracking_idIn;
  }

/**
 *
 * Sets the ContractTrackingIdServ
 * @param contract_tracking_id_servIn Value of the contract_tracking_id_serv
 *
 */

  public void setContractTrackingIdServ(Integer contract_tracking_id_servIn) {
    contract_tracking_id_serv = contract_tracking_id_servIn;
  }

/**
 *
 * Sets the DisconnectDate
 * @param _disconnect_dateIn Value of the _disconnect_date
 *
 */

  public void setDisconnectDate(Date _disconnect_dateIn) {
    _disconnect_date = _disconnect_dateIn;
  }

  public void translateFromMap() {
    contract_tracking_id = (Integer)inputMap.get("ContractTrackingId");
    contract_tracking_id_serv = (Integer)inputMap.get("ContractTrackingIdServ");
    _disconnect_date = (Date)inputMap.get("DisconnectDate");
  }

/**
 *
 * Gets the ContractTrackingId
 * @return Value of the ContractTrackingId
 *
 */

  public Integer getContractTrackingId( ) {
    return contract_tracking_id;
  }

/**
 *
 * Gets the ContractTrackingIdServ
 * @return Value of the ContractTrackingIdServ
 *
 */

  public Integer getContractTrackingIdServ( ) {
    return contract_tracking_id_serv;
  }

/**
 *
 * Gets the DisconnectDate
 * @return Value of the DisconnectDate
 *
 */

  public Date getDisconnectDate( ) {
    return _disconnect_date;
  }

}
