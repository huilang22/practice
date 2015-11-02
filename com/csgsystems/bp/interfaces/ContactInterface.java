
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
public interface ContactInterface extends BaliInterface {

  /**
   * Get a Contact..
   * Convenience method using default BSDMSessionContext.
   * @param ContactgetIn Input Object Key.
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ContactObjectData get (ContactObjectKeyData ContactgetIn) throws BSDMResourceException;
  /**
   * Get a Contact..
   * @param context The session context to use when connecting to the APITS server.
   * @param ContactgetIn Input Object Key.
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ContactObjectData get (BSDMSessionContext context, ContactObjectKeyData ContactgetIn) throws BSDMResourceException;


  /**
   * Get a Contact..
   * Convenience method using default BSDMSessionContext.
   * @param ContactgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ContactObjectData get (ContactObjectKeyData ContactgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Get a Contact..
   * @param context The session context to use when connecting to the APITS server.
   * @param ContactgetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ContactObjectData get (BSDMSessionContext context, ContactObjectKeyData ContactgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Contact's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ContactfindIn Input Filter Object.
   * @return ContactObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ContactObjectDataList find (ContactObjectFilter ContactfindIn) throws BSDMResourceException;
  /**
   * Find Contact's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ContactfindIn Input Filter Object.
   * @return ContactObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ContactObjectDataList find (BSDMSessionContext context, ContactObjectFilter ContactfindIn) throws BSDMResourceException;


  /**
   * Find Contact's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ContactfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ContactObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ContactObjectDataList find (ContactObjectFilter ContactfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Contact's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ContactfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ContactObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ContactObjectDataList find (BSDMSessionContext context, ContactObjectFilter ContactfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new Contact..
   * Convenience method using default BSDMSessionContext.
   * @param ContactCreateIn Input  Object.  Read-Only fields: AddressId, ContactId, ChgWho, ChgDt, CreateDt.  Defaulted Fields: DateActive.  Derived Fields: ContactId, CreateDt, ChgDt, ChgWho, AddressId.
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ContactObjectData create (ContactObjectData ContactCreateIn) throws BSDMResourceException;
  /**
   * Create a new Contact..
   * @param context The session context to use when connecting to the APITS server.
   * @param ContactCreateIn Input  Object.  Read-Only fields: AddressId, ContactId, ChgWho, ChgDt, CreateDt.  Defaulted Fields: DateActive.  Derived Fields: ContactId, CreateDt, ChgDt, ChgWho, AddressId.
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ContactObjectData create (BSDMSessionContext context, ContactObjectData ContactCreateIn) throws BSDMResourceException;


  /**
   * Create a new Contact..
   * Convenience method using default BSDMSessionContext.
   * @param ContactCreateIn Input  Object.  Read-Only fields: AddressId, ContactId, ChgWho, ChgDt, CreateDt.  Defaulted Fields: DateActive.  Derived Fields: ContactId, CreateDt, ChgDt, ChgWho, AddressId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ContactObjectData create (ContactObjectData ContactCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new Contact..
   * @param context The session context to use when connecting to the APITS server.
   * @param ContactCreateIn Input  Object.  Read-Only fields: AddressId, ContactId, ChgWho, ChgDt, CreateDt.  Defaulted Fields: DateActive.  Derived Fields: ContactId, CreateDt, ChgDt, ChgWho, AddressId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ContactObjectData create (BSDMSessionContext context, ContactObjectData ContactCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update non-key fields of a Contact..
   * Convenience method using default BSDMSessionContext.
   * @param ContactUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, CreateDt.  Derived Fields: ChgDt, ChgWho.
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ContactObjectData update (ContactObjectData ContactUpdateIn) throws BSDMResourceException;
  /**
   * Update non-key fields of a Contact..
   * @param context The session context to use when connecting to the APITS server.
   * @param ContactUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, CreateDt.  Derived Fields: ChgDt, ChgWho.
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ContactObjectData update (BSDMSessionContext context, ContactObjectData ContactUpdateIn) throws BSDMResourceException;


  /**
   * Update non-key fields of a Contact..
   * Convenience method using default BSDMSessionContext.
   * @param ContactUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, CreateDt.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ContactObjectData update (ContactObjectData ContactUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update non-key fields of a Contact..
   * @param context The session context to use when connecting to the APITS server.
   * @param ContactUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, CreateDt.  Derived Fields: ChgDt, ChgWho.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ContactObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ContactObjectData update (BSDMSessionContext context, ContactObjectData ContactUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
