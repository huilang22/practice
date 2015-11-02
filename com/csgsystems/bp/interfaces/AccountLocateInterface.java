
package com.csgsystems.bp.interfaces;

import java.io.*;
import java.math.*;
import java.util.*;

import javax.ejb.Remote;

import com.csgsystems.bali.BaliInterface;

import com.csgsystems.aruba.connection.BSDMResourceException;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.constraint.ConstraintException;


import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface AccountLocateInterface extends BaliInterface {

  /**
   * Locate an Account and find which Server it is on..
   * Convenience method using default BSDMSessionContext.
   * @param algIn Input Object Key.
   * @return AccountLocateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountLocateObjectData get (AccountLocateObjectKeyData algIn) throws BSDMResourceException;
  /**
   * Locate an Account and find which Server it is on..
   * @param context The session context to use when connecting to the APITS server.
   * @param algIn Input Object Key.
   * @return AccountLocateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountLocateObjectData get (BSDMSessionContext context, AccountLocateObjectKeyData algIn) throws BSDMResourceException;


  /**
   * Locate an Account and find which Server it is on..
   * Convenience method using default BSDMSessionContext.
   * @param algIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountLocateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountLocateObjectData get (AccountLocateObjectKeyData algIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Locate an Account and find which Server it is on..
   * @param context The session context to use when connecting to the APITS server.
   * @param algIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountLocateObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountLocateObjectData get (BSDMSessionContext context, AccountLocateObjectKeyData algIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Locate Accounts and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param alfIn Input Filter Object.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountLocateXIDObjectDataList find (AccountLocateXIDObjectFilter alfIn) throws BSDMResourceException;
  /**
   * Locate Accounts and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alfIn Input Filter Object.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountLocateXIDObjectDataList find (BSDMSessionContext context, AccountLocateXIDObjectFilter alfIn) throws BSDMResourceException;


  /**
   * Locate Accounts and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param alfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountLocateXIDObjectDataList find (AccountLocateXIDObjectFilter alfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Locate Accounts and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountLocateXIDObjectDataList find (BSDMSessionContext context, AccountLocateXIDObjectFilter alfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Locate Accounts by Service info and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param alsfIn Input Filter Object.
   * @return ServiceLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceLocateXIDObjectDataList findByServiceId (ServiceLocateXIDObjectFilter alsfIn) throws BSDMResourceException;
  /**
   * Locate Accounts by Service info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alsfIn Input Filter Object.
   * @return ServiceLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ServiceLocateXIDObjectDataList findByServiceId (BSDMSessionContext context, ServiceLocateXIDObjectFilter alsfIn) throws BSDMResourceException;


  /**
   * Locate Accounts by Service info and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param alsfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ServiceLocateXIDObjectDataList findByServiceId (ServiceLocateXIDObjectFilter alsfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Locate Accounts by Service info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alsfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ServiceLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ServiceLocateXIDObjectDataList findByServiceId (BSDMSessionContext context, ServiceLocateXIDObjectFilter alsfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Locate Distinct Accounts by ServiceId info and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param ExternalIdEquipMap Input Filter Object.  Read-Only fields: AccountExternalId.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountLocateXIDObjectDataList listByServiceId (ServiceLocateXIDObjectFilter ExternalIdEquipMap) throws BSDMResourceException;
  /**
   * Locate Distinct Accounts by ServiceId info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param ExternalIdEquipMap Input Filter Object.  Read-Only fields: AccountExternalId.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountLocateXIDObjectDataList listByServiceId (BSDMSessionContext context, ServiceLocateXIDObjectFilter ExternalIdEquipMap) throws BSDMResourceException;


  /**
   * Locate Distinct Accounts by ServiceId info and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param ExternalIdEquipMap Input Filter Object.  Read-Only fields: AccountExternalId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountLocateXIDObjectDataList listByServiceId (ServiceLocateXIDObjectFilter ExternalIdEquipMap, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Locate Distinct Accounts by ServiceId info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param ExternalIdEquipMap Input Filter Object.  Read-Only fields: AccountExternalId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountLocateXIDObjectDataList listByServiceId (BSDMSessionContext context, ServiceLocateXIDObjectFilter ExternalIdEquipMap, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Locate Accounts by Order info and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param alonIn Input Filter Object.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountLocateXIDObjectDataList findByOrderNumber (OrderLocateXIDObjectFilter alonIn) throws BSDMResourceException;
  /**
   * Locate Accounts by Order info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alonIn Input Filter Object.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountLocateXIDObjectDataList findByOrderNumber (BSDMSessionContext context, OrderLocateXIDObjectFilter alonIn) throws BSDMResourceException;


  /**
   * Locate Accounts by Order info and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param alonIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountLocateXIDObjectDataList findByOrderNumber (OrderLocateXIDObjectFilter alonIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Locate Accounts by Order info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alonIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountLocateXIDObjectDataList findByOrderNumber (BSDMSessionContext context, OrderLocateXIDObjectFilter alonIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Locate Accounts by Address info and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param alafIn Input Filter Object.
   * @return AddressLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AddressLocateXIDObjectDataList findByAddressId (AddressLocateXIDObjectFilter alafIn) throws BSDMResourceException;
  /**
   * Locate Accounts by Address info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alafIn Input Filter Object.
   * @return AddressLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AddressLocateXIDObjectDataList findByAddressId (BSDMSessionContext context, AddressLocateXIDObjectFilter alafIn) throws BSDMResourceException;


  /**
   * Locate Accounts by Address info and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param alafIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AddressLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AddressLocateXIDObjectDataList findByAddressId (AddressLocateXIDObjectFilter alafIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Locate Accounts by Address info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alafIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AddressLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AddressLocateXIDObjectDataList findByAddressId (BSDMSessionContext context, AddressLocateXIDObjectFilter alafIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Locate Accounts by Account Extended data info and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param alaedfIn Input Filter Object.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountLocateXIDObjectDataList findByAccountExtendeddata (AccountExtendedDataLocateXIDObjectFilter alaedfIn) throws BSDMResourceException;
  /**
   * Locate Accounts by Account Extended data info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alaedfIn Input Filter Object.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountLocateXIDObjectDataList findByAccountExtendeddata (BSDMSessionContext context, AccountExtendedDataLocateXIDObjectFilter alaedfIn) throws BSDMResourceException;


  /**
   * Locate Accounts by Account Extended data info and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param alaedfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountLocateXIDObjectDataList findByAccountExtendeddata (AccountExtendedDataLocateXIDObjectFilter alaedfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Locate Accounts by Account Extended data info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alaedfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountLocateXIDObjectDataList findByAccountExtendeddata (BSDMSessionContext context, AccountExtendedDataLocateXIDObjectFilter alaedfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Locate Accounts by Service Extended data info and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param alsedfIn Input Filter Object.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountLocateXIDObjectDataList findByServiceExtendeddata (ServiceExtendedDataLocateXIDObjectFilter alsedfIn) throws BSDMResourceException;
  /**
   * Locate Accounts by Service Extended data info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alsedfIn Input Filter Object.
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public AccountLocateXIDObjectDataList findByServiceExtendeddata (BSDMSessionContext context, ServiceExtendedDataLocateXIDObjectFilter alsedfIn) throws BSDMResourceException;


  /**
   * Locate Accounts by Service Extended data info and find which Servers they are on..
   * Convenience method using default BSDMSessionContext.
   * @param alsedfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public AccountLocateXIDObjectDataList findByServiceExtendeddata (ServiceExtendedDataLocateXIDObjectFilter alsedfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Locate Accounts by Service Extended data info and find which Servers they are on..
   * @param context The session context to use when connecting to the APITS server.
   * @param alsedfIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return AccountLocateXIDObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public AccountLocateXIDObjectDataList findByServiceExtendeddata (BSDMSessionContext context, ServiceExtendedDataLocateXIDObjectFilter alsedfIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
